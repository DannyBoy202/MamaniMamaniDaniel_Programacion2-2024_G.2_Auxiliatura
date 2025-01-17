import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<String> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(String item) {
        items.add(item);
    }

    public void mostrarItems() {
        System.out.println("Inventario:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }

    public List<String> getItems() {
        return items;
    }
}
