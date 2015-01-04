public class Main
{
    private static final String colors[] = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Purple"};

    private static String getRandomColor()
    {
        int number = (int)(Math.random() * colors.length);
        System.out.println(number + " ");
        return colors[number];
    }

    public static void main(String args[])
    {
        for(int i=0; i < 10; ++i)
        {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.draw();
        }
    }
}
