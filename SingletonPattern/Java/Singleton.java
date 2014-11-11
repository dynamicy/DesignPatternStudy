class Singleton
{
    private static Singleton instance;

    // Prevent creating new instance from other class.
    private Singleton() 
    {
    }

    // If other memebers want to get instance, they have to use this method.
    public static Singleton GetInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args)
    {
        Singleton singletonInstance1 = Singleton.GetInstance();
        Singleton singletonInstance2 = Singleton.GetInstance();

        if(singletonInstance1 == singletonInstance2)
        {
            System.out.println("They're the same instance");
        }
    }
}
