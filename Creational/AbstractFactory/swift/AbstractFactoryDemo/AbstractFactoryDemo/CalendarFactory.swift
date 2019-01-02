//
//  CalendarFactory.swift
//  AbstractFactoryDemo
//
//  Created by Chris on 2019/1/2.
//  Copyright © 2019 Chris. All rights reserved.
//

import Foundation

protocol Calendar {
    var accessToken: String { get }
    var refreshToken: String { get }
    var userName: String { get }
}

private struct Google: Calendar {
    var accessToken: String
    var refreshToken: String
    var userName: String
}

private struct Microsoft: Calendar {
    var accessToken: String
    var refreshToken: String
    var userName: String
}

protocol CalendarFactory {
    func createCalendar() -> Calendar?
}

class GoogleCalendarFactory: CalendarFactory {
    
    func createCalendar() -> Calendar? {
        return Google(accessToken: "Google-Access-Token", refreshToken: "Google-Refresh-Token", userName: "Google")
    }
}

class MicrosoftCalendarFactory: CalendarFactory {
    func createCalendar() -> Calendar? {
        return Microsoft(accessToken: "Microsoft-Access-Token", refreshToken: "Microsoft-Refresh-Token", userName: "Microsoft")
    }
}

enum CalType: String {
    case microsoft = "Microsoft"
    case google = "Google"
}

class CalendarBuilder {
    private var platform: String
    private var factory: CalendarFactory?
    
    init(platform: String) {
        self.platform = platform
    }
    
    func initFactory() -> Void {
        if nil != factory { return }
        
        if platform == CalType.google.rawValue {
            factory = GoogleCalendarFactory()
        } else {
            factory = MicrosoftCalendarFactory()
        }
    }
    
    func buildCalendar() -> Calendar {
        initFactory()
        return (factory?.createCalendar())!
    }

}
