public class SynchronizedSingleton 
{
    private static SynchronizedSingleton instance = null;
    
    private SynchronizedSingleton()
    {
    }

    // Make sure that only one thread can access the instance
    synchronized static public SynchronizedSingleton getInstance() 
    {
        if (instance == null) 
        {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
