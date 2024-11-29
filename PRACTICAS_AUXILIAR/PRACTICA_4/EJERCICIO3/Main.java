public class Main {
    public static void main(String[] args) {
        Vaca vaca = new Vaca("Lola", 5);
        Oveja oveja = new Oveja("Dolly", 3);

        vaca.mostrarInfo();
        vaca.hacerSonido();
        vaca.producir();

        oveja.mostrarInfo();
        oveja.hacerSonido();
        oveja.producir();
    }
}
