public class App {
    public static void main(String[] args) {

        Mawar mawar = new Mawar("Mawar", "Merah", 50000, true);
        Melati melati = new Melati("Melati", "Putih", 30000, "Lembut");
        Anggrek anggrek = new Anggrek("Anggrek", "Ungu", 75000, "Phalaenopsis");

        katalog catalog = new katalog();

        catalog.addFlower(mawar);
        catalog.addFlower(melati);
        catalog.addFlower(anggrek);

        catalog.displayCatalog();
    }
}
