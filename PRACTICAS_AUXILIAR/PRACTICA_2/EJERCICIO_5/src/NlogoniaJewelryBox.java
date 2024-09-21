import java.util.Scanner;

public class NlogoniaJewelryBox {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer el tamaño de la caja
            System.out.print("Ingrese el tamaño de la caja (N): ");
            int N = scanner.nextInt();

            // Leer la matriz de perlas
            int[][] originalBox = new int[N][N];
            System.out.println("Ingrese la matriz de perlas:");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    originalBox[i][j] = scanner.nextInt();
                }
            }

            // Crear matrices para las rotaciones
            int[][] rotated90 = rotate90(originalBox, N);
            int[][] rotated180 = rotate90(rotated90, N);
            int[][] rotated270 = rotate90(rotated180, N);

            // Comparar las matrices para encontrar el número mínimo de rotaciones
            if (isEqual(originalBox, rotated90, N)) {
                System.out.println(3);
            } else if (isEqual(originalBox, rotated180, N)) {
                System.out.println(2);
            } else if (isEqual(originalBox, rotated270, N)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    // Método para rotar la matriz 90 grados en sentido antihorario
    public static int[][] rotate90(int[][] matrix, int N) {
        int[][] rotated = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotated[N - j - 1][i] = matrix[i][j];
            }
        }
        return rotated;
    }

    // Método para comparar dos matrices
    public static boolean isEqual(int[][] matrix1, int[][] matrix2, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
