public class Main {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getLoggers();

        loggerChain.showMessage(AbstractLogger.KERN_EMERG, "Start kernel stracing.");

        loggerChain.showMessage(AbstractLogger.KERN_DEBUG, "An error occured.");
    }

    private static AbstractLogger getLoggers() {
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.KERN_DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.KERN_EMERG);

        debugLogger.setLogger(consoleLogger);

        return debugLogger;
    }
}
