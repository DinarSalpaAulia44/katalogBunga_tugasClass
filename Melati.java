public class Melati extends Bunga {
    private String fragranceLevel;

    public Melati(String name, String color, double price, String fragranceLevel) {
        super(name, color, price);
        this.fragranceLevel = fragranceLevel;
    }

    @Override
    public void bloom() {
        System.out.println(name + " mekar dengan aroma harum yang menenangkan.");
    }

    @Override
    public void displayInfo() {
        System.out.println("🌼 Melati - Warna: " + color + ", Harga: Rp " + price +
                ", Keharuman: " + fragranceLevel);
    }
}
