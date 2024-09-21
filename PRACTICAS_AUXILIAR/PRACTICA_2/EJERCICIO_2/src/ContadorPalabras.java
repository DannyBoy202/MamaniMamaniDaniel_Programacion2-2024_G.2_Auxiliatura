import java.util.List;
import java.util.ArrayList;

public class ContadorPalabras {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("manzana");
        palabras.add("mango");
        palabras.add("pera");
        palabras.add("melón");
        palabras.add("plátano");

        char letra = 'm';
        int contador = contarPalabrasQueEmpiezanCon(palabras, letra);
        System.out.println("Número de palabras que comienzan con '" + letra + "': " + contador);
    }

    public static int contarPalabrasQueEmpiezanCon(List<String> palabras, char letra) {
        int contador = 0;
        for (String palabra : palabras) {
            if (palabra.toLowerCase().charAt(0) == letra) {
                contador++;
            }
        }
        return contador;
    }
}
