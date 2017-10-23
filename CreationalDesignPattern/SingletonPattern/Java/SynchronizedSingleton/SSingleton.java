public class SSingleton {
    private static SSingleton instance = null;

    private SSingleton() {
    }

    // Make sure that only one thread can access the instance
    synchronized static public SSingleton getInstance() {
        if (instance == null) {
            instance = new SSingleton();
        }
        return instance;
    }
}
