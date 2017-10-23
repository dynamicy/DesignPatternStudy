public class Main {
    public static void main(String args[]) {
        SSingleton instance1 = SSingleton.getInstance();
        SSingleton instance2 = SSingleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("They're the same instance");
        }
    }
}
