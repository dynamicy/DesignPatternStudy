public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        super(level);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("[Debug]: " + msg);
    }
}
