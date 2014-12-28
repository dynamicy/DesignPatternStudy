public class Main
{
    public static void main(String args[])
    {
        DCLSingleton instance1 = DCLSingleton.getInstance();
        DCLSingleton instance2 = DCLSingleton.getInstance();

        if(instance1 == instance2)
        {
            System.out.println("They're the same instance");
        }
    }
}
