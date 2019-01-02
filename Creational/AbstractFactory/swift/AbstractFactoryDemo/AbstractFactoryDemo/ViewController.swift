//
//  ViewController.swift
//  AbstractFactoryDemo
//
//  Created by Chris on 2019/1/2.
//  Copyright © 2019 Chris. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    let googleCalendarBuilder: CalendarBuilder = CalendarBuilder(platform: CalType.google.rawValue)
    let microsoftCalendarBuildr: CalendarBuilder = CalendarBuilder(platform: CalType.microsoft.rawValue)
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let googleCalendar = googleCalendarBuilder.buildCalendar()
        let microsoftCalendar = microsoftCalendarBuildr.buildCalendar()
        
        print(googleCalendar.userName)
        print(googleCalendar.accessToken)
        print(googleCalendar.refreshToken)
        
        print(microsoftCalendar.userName)
        print(microsoftCalendar.accessToken)
        print(microsoftCalendar.refreshToken)
    }
}
