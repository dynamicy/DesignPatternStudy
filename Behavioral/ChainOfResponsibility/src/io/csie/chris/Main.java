package io.csie.chris;

import io.csie.chris.logger.AbstractLogger;
import io.csie.chris.logger.ConsoleLogger;
import io.csie.chris.logger.DebugLogger;
import io.csie.chris.logger.common.LoggerLevel;

public class Main {

    public static void main(String[] args) {

        AbstractLogger loggerChain = getLoggers();

        loggerChain.showMessage(LoggerLevel.KERN_EMERG.getLevel(), "Start kernel stracing.");

        loggerChain.showMessage(LoggerLevel.KERN_DEBUG.getLevel(), "An error occured.");
    }

    private static AbstractLogger getLoggers() {

        AbstractLogger debugLogger = new DebugLogger(LoggerLevel.KERN_DEBUG.getLevel());
        AbstractLogger consoleLogger = new ConsoleLogger(LoggerLevel.KERN_EMERG.getLevel());

        debugLogger.setLogger(consoleLogger);

        return debugLogger;
    }
}
