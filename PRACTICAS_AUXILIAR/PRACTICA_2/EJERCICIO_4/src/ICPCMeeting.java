import java.util.Scanner;

public class ICPCMeeting {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer el número de directores
        System.out.print("Ingrese el número de directores: ");
        int N = scanner.nextInt();

        // Leer la duración máxima de la reunión
        System.out.print("Ingrese la duración máxima de la reunión en minutos: ");
        int K = scanner.nextInt();

        // Validar los valores de entrada
        if (N < 1 || N > 100) {
            System.out.println("El número de directores debe estar entre 1 y 100.");
            return;
        }
        if (K < 1 || K > 1000 || K < N) {
            System.out.println("La duración máxima de la reunión debe estar entre 1 y 1000 minutos y no puede ser menor que el número de directores.");
            return;
        }

        // Calcular la duración máxima de cada discurso
        int maxSpeechDuration = (K - (N - 1)) / N;

        // Asegurarse de que la duración del discurso sea al menos 1 minuto
        if (maxSpeechDuration < 1) {
            maxSpeechDuration = 1;
        }

        // Imprimir la duración máxima de cada discurso
        System.out.println("La duración máxima de cada discurso es: " + maxSpeechDuration + " minutos.");
    }
}
