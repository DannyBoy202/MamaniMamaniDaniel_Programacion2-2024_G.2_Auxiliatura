import java.util.Scanner;

public class fraccionesContinuas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el valor de N
        System.out.print("Ingrese el valor de N: ");
        int N = scanner.nextInt();

        // Inicializar los valores de los numeradores y denominadores
        int numerator = 1;
        int denominator = 1;

        // Calcular la fracción continua para el nivel N
        for (int i = 1; i <= N; i++) {
            int temp = numerator;
            numerator = numerator + denominator;
            denominator = temp;
        }

        // Imprimir el numerador de la fracción PN
        System.out.println(numerator);
    }
}
