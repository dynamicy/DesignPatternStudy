public abstract class AbstractLogger {
    /* Define the level, 1 the heightest one. */
    public static int KERN_EMERG = 1;
    public static int KERN_ALERT = 2;
    public static int KERN_CRIT = 3;
    public static int KERN_WARNING = 4;
    public static int KERN_NOTICE = 5;
    public static int KERN_INFO = 6;
    public static int KERN_DEBUG = 7;

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
