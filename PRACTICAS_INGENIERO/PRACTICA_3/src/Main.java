import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();

        System.out.println("Elige el tipo de operación: 1. Real 2. Compleja");
        int tipo = scanner.nextInt();

        if (tipo == 1) {
            System.out.println("Ingresa dos números reales:");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            System.out.println("Elige la operación: 1. Sumar 2. Restar 3. Multiplicar 4. Dividir");
            int operacion = scanner.nextInt();

            double resultado = 0;
            switch (operacion) {
                case 1:
                    resultado = operaciones.sumar(num1, num2);
                    break;
                case 2:
                    resultado = operaciones.restar(num1, num2);
                    break;
                case 3:
                    resultado = operaciones.multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = operaciones.dividir(num1, num2);
                    break;
                default:
                    System.out.println("Operación no válida.");
                    return;
            }
            System.out.println("El resultado es: " + resultado);
        } else if (tipo == 2) {
            System.out.println("Ingresa los números complejos en formato (a, b) y (c, d):");
            double[] complejo1 = {scanner.nextDouble(), scanner.nextDouble()};
            double[] complejo2 = {scanner.nextDouble(), scanner.nextDouble()};

            System.out.println("Elige la operación: 1. Sumar 2. Restar 3. Multiplicar por escalar");
            int operacion = scanner.nextInt();

            double[] resultado = new double[2];
            switch (operacion) {
                case 1:
                    resultado = operaciones.sumarComplejos(complejo1, complejo2);
                    break;
                case 2:
                    resultado = operaciones.restarComplejos(complejo1, complejo2);
                    break;
                case 3:
                    System.out.println("Ingresa el escalar:");
                    double escalar = scanner.nextDouble();
                    resultado = operaciones.multiplicarPorEscalar(complejo1, escalar);
                    break;
                default:
                    System.out.println("Operación no válida.");
                    return;
            }
            System.out.println("El resultado es: (" + resultado[0] + ", " + resultado[1] + ")");
        } else {
            System.out.println("Tipo de operación no válido.");
        }

        scanner.close();
    }
}
