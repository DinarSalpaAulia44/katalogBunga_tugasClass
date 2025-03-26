public abstract class Bunga {
    protected String name;
    protected String color;
    protected double price;

    public Bunga(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public abstract void bloom(); // Overriding di subclass

    public abstract void displayInfo(); // Overriding di subclass

    public String getName() {
        return name;
    }
}
