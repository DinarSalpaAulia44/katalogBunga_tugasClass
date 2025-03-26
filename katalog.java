import java.util.ArrayList;
import java.util.List;

public class katalog {
    private List<Bunga> flowers;

    public katalog() {
        this.flowers = new ArrayList<>();
    }

    public void addFlower(Bunga flower) {
        flowers.add(flower);
    }

    public void displayCatalog() {
        if (flowers.isEmpty()) {
            System.out.println("Katalog bunga kosong.");
            return;
        }
        System.out.println("\n--- 🌺 Katalog Bunga 🌺 ---");
        for (Bunga flower : flowers) {
            flower.displayInfo();
        }
    }
}
