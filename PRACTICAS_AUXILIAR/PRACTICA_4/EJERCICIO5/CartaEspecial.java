package EJERCICIO5;

public class CartaEspecial extends Carta implements Accionable {
    public CartaEspecial(int valor, String palo) {
        super(valor, palo);
    }

    @Override
    public void jugar() {
        System.out.println("Carta especial jugada: " + valor + " de " + palo);
    }

    @Override
    public void realizarAccion() {
        System.out.println("Acción especial realizada por la carta: " + valor + " de " + palo);
    }
}
