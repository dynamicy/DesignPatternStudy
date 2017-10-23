public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int priority) {
        super(priority);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("[Console]: " + msg);
    }
}
