/**
 * Created by chris on 1/4/15.
 */
public class ProxyImage implements IImage {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("realImage doesn't exist!");
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
