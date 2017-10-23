package io.csie.chris.logger;

public class DebugLogger extends AbstractLogger {

    private static final String TAG = DebugLogger.class.getSimpleName();

    public DebugLogger(int level) {
        super(level);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println(TAG + ": " + msg);
    }
}
