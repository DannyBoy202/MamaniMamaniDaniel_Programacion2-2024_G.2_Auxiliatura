import java.util.Scanner;

public class MaxLexicographicSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de elementos
        System.out.print("Ingrese el número de elementos (N): ");
        int N = scanner.nextInt();

        // Leer la lista de números
        int[] numbers = new int[N];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calcular la secuencia máxima lexicográficamente
        int[] maxSequence = getMaxLexicographicSequence(numbers);

        // Imprimir la secuencia máxima
        for (int num : maxSequence) {
            System.out.print(num + " ");
        }
    }

    // Método para obtener la secuencia máxima lexicográficamente
    public static int[] getMaxLexicographicSequence(int[] numbers) {
        int N = numbers.length;
        int[] result = new int[N];

        // Convertir todos los números a su representación binaria
        String[] binaryNumbers = new String[N];
        for (int i = 0; i < N; i++) {
            binaryNumbers[i] = Integer.toBinaryString(numbers[i]);
        }

        // Ordenar los números binarios en orden lexicográfico inverso
        java.util.Arrays.sort(binaryNumbers, java.util.Collections.reverseOrder());

        // Convertir los números binarios ordenados de vuelta a enteros
        for (int i = 0; i < N; i++) {
            result[i] = Integer.parseInt(binaryNumbers[i], 2);
        }

        return result;
    }
}
