package io.csie.chris.logger;

public abstract class AbstractLogger {

    protected int level;

    public AbstractLogger(int level) {
        this.level = level;
    }

    /* The next logger in the chain of responsibility */
    protected AbstractLogger nextLogger;

    public void setLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    abstract protected void writeMessage(String msg);

    public void showMessage(int priority, String msg) {
        if (priority <= level) {
            writeMessage(msg);
        }

        if (nextLogger != null) {
            nextLogger.showMessage(priority, msg);
        }
    }
}
