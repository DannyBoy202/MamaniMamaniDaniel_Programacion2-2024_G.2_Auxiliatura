public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Alice", 100);
        Jugador jugador2 = new Jugador("Bob", 150);

        // Aplicar bonificación usando expresiones lambda
        CalculadoraBonificacion bonificacionDoble = puntosBase -> puntosBase * 2;
        CalculadoraBonificacion bonificacionFija = puntosBase -> 50;

        jugador1.aplicarBonificacion(bonificacionDoble);
        jugador2.aplicarBonificacion(bonificacionFija);

        System.out.println(jugador1);
        System.out.println(jugador2);
    }
}
