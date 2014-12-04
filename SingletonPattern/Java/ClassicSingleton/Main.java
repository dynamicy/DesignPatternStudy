class Main
{
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
