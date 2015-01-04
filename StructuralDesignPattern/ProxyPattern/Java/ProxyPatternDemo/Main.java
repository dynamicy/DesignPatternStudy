public class Main
{
    public static void main(String args[])
    {
        IImage iImage = new ProxyImage("picture_2014_12_31.png");

        iImage.display();
        System.out.println("======================");
        iImage.display();
    }
}
