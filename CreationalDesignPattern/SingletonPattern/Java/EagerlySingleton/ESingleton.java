public class ESingleton {
    // Use static initiallizer, that will make instace created fast.
    private static ESingleton instance = new ESingleton();

    private ESingleton() {
    }

    // Just get the instance
    public static ESingleton getInstance() {
        return instance;
    }
}
