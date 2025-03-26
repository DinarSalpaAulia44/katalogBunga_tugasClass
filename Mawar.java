public class Mawar extends Bunga {
    private boolean hasThorns;

    public Mawar(String name, String color, double price, boolean hasThorns) {
        super(name, color, price);
        this.hasThorns = hasThorns;
    }

    @Override
    public void bloom() {
        System.out.println(name + " mekar dengan kelopak merah yang indah.");
    }

    @Override
    public void displayInfo() {
        System.out.println("🌹 Mawar - Warna: " + color + ", Harga: Rp " + price +
                ", Berduri: " + (hasThorns ? "Ya" : "Tidak"));
    }
}
