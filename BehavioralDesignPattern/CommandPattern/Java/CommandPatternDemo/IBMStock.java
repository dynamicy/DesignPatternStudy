public class IBMStock implements Stock {
    String name;
    int quantity;

    IBMStock() {
        this.name = "IBM";
        this.quantity = 100;
    }

    @Override
    public void buy() {
        System.out.println("[Buy] Stock name: " + name + " quantity: " + quantity);
    }

    @Override
    public void sell() {
        System.out.println("[Sell] Stock name: " + name + " quantity: " + quantity);
    }
}
