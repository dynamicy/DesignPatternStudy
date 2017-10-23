public class RealImage implements IImage {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        this.loadImage(this.fileName);
    }

    @Override
    public void display() {
        System.out.println(this.fileName);
    }

    public void loadImage(String fileName) {
        System.out.println("Load " + fileName);
    }
}
