package EJERCICIO5;

public class CartaNormal extends Carta {
    public CartaNormal(int valor, String palo) {
        super(valor, palo);
    }

    @Override
    public void jugar() {
        System.out.println("Carta normal jugada: " + valor + " de " + palo);
    }
}
