public class Anggrek extends Bunga {
    private String species;

    public Anggrek(String name, String color, double price, String species) {
        super(name, color, price);
        this.species = species;
    }

    @Override
    public void bloom() {
        System.out.println(name + " mekar dengan keindahan unik.");
    }

    @Override
    public void displayInfo() {
        System.out.println("💐 Anggrek - Warna: " + color + ", Harga: Rp " + price +
                ", Spesies: " + species);
    }
}
