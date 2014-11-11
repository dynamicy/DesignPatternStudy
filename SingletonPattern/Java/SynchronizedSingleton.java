public class SynchronizedSingleton 
{
    private static SynchronizedSingleton instance = null;
    
    private SynchronizedSingleton()
    {
    }
    
    synchronized static public SynchronizedSingleton getInstance() 
    {
        if (instance == null) 
        {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
