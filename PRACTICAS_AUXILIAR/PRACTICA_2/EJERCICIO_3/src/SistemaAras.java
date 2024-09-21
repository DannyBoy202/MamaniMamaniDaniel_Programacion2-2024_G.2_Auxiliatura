import java.util.Random;

public class SistemaAras {
    private static final String[] RAREZAS = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Arma arma = obtenerArma();
        System.out.println("¡Has obtenido un arma!");
        System.out.println(arma);
    }

    public static Arma obtenerArma() {
        String nombre = "Espada";
        String rareza = RAREZAS[RANDOM.nextInt(RAREZAS.length)];
        int daño = generarAtributo(rareza);
        int precision = generarAtributo(rareza);
        int absorcion = generarAtributo(rareza);

        return new Arma(nombre, rareza, daño, precision, absorcion);
    }

    private static int generarAtributo(String rareza) {
        switch (rareza) {
            case "Común":
                return RANDOM.nextInt(10) + 1;
            case "Poco Común":
                return RANDOM.nextInt(20) + 10;
            case "Raro":
                return RANDOM.nextInt(30) + 20;
            case "Épico":
                return RANDOM.nextInt(40) + 30;
            case "Legendario":
                return RANDOM.nextInt(50) + 40;
            default:
                return 0;
        }
    }
}
