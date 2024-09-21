import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FechaNumerica {
    private static final Map<String, String> meses = new HashMap<>();

    static {
        meses.put("enero", "01");
        meses.put("febrero", "02");
        meses.put("marzo", "03");
        meses.put("abril", "04");
        meses.put("mayo", "05");
        meses.put("junio", "06");
        meses.put("julio", "07");
        meses.put("agosto", "08");
        meses.put("septiembre", "09");
        meses.put("octubre", "10");
        meses.put("noviembre", "11");
        meses.put("diciembre", "12");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha (ej. 4 de junio, 2004):");
        String entrada = scanner.nextLine();
        String[] partes = entrada.split(" de |, ");
        
        if (partes.length != 3) {
            System.out.println("Formato de entrada incorrecto.");
            return;
        }

        String dia = partes[0].length() == 1 ? "0" + partes[0] : partes[0];
        String mes = meses.get(partes[1].toLowerCase());
        String año = partes[2];

        if (mes == null) {
            System.out.println("Mes incorrecto.");
            return;
        }

        if (!esFechaValida(dia, mes, año)) {
            System.out.println("Fecha inválida.");
            return;
        }

        System.out.println(dia + "/" + mes + "/" + año);
    }

    private static boolean esFechaValida(String dia, String mes, String año) {
        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int añoInt = Integer.parseInt(año);

        if (mesInt == 2) {
            if (esBisiesto(añoInt)) {
                return diaInt <= 29;
            } else {
                return diaInt <= 28;
            }
        }

        if (mesInt == 4 || mesInt == 6 || mesInt == 9 || mesInt == 11) {
            return diaInt <= 30;
        }

        return diaInt <= 31;
    }

    private static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
