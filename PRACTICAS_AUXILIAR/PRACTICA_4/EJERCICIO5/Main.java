package EJERCICIO5;

public class Main {
    public static void main(String[] args) {
        CartaNormal cartaNormal = new CartaNormal(7, "Corazones");
        CartaEspecial cartaEspecial = new CartaEspecial(1, "Espadas");

        cartaNormal.mostrarCarta();
        cartaNormal.jugar();

        cartaEspecial.mostrarCarta();
        cartaEspecial.jugar();
        cartaEspecial.realizarAccion();
    }
}
