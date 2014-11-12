public class EagerlySingleton
{
    // Use static initiallizer, that will make instace created fast.
    private static EagerlySingleton instance = new EagerlySingleton();

    private EagerlySingleton()
    {
    }

    // Just get the instance
    public static EagerlySingleton getInstance()
    {
        return instance;
    }

    public static void main(String[] args)
    {
        EagerlySingleton singletonInstance1 = EagerlySingleton.getInstance();
        EagerlySingleton singletonInstance2 = EagerlySingleton.getInstance();

        if(singletonInstance1 == singletonInstance2)
        {
            System.out.println("They're the same instance");
        }
    }
}
