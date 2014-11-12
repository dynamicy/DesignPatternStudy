public class DoubleCheckLockSingleton
{
    // Use volatile to ensure that works on multithread.
    private volatile static DoubleCheckLockSingleton instance = null;

    // Make this instance can be accessed only by public method.
    private DoubleCheckLockSingleton()
    {
    }

    public static DoubleCheckLockSingleton getInstance() 
    {
        // Only if it's the first for creating instance.
        if (instance == null)
        {
            // The method is synchronized on the class object.
            synchronized(DoubleCheckLockSingleton.class)
            {
                // If the instance isn't existed, create the instance.
                if(instance == null) 
                {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
