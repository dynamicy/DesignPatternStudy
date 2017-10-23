package io.csie.chris.logger;

public class ConsoleLogger extends AbstractLogger {

    private static final String TAG = ConsoleLogger.class.getSimpleName();

    public ConsoleLogger(int priority) {
        super(priority);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println(TAG + ": " + msg);
    }
}
