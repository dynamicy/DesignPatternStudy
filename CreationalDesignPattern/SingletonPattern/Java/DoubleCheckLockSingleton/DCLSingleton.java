public class DCLSingleton
{
    // Use volatile to ensure that works on multithread.
    private volatile static DCLSingleton instance = null;

    // Make this instance can be accessed only by public method.
    private DCLSingleton() {}

    public static DCLSingleton getInstance() 
    {
        // Only if it's the first for creating instance.
        if (instance == null)
        {
            // The method is synchronized on the class object.
            synchronized(DCLSingleton.class)
            {
                // If the instance isn't existed, create the instance.
                if(instance == null) 
                {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
