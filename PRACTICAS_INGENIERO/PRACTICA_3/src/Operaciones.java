class Operaciones {
    // Métodos para operaciones con números reales
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
    }

    // Métodos para operaciones con números complejos
    public double[] sumarComplejos(double[] a, double[] b) {
        return new double[]{a[0] + b[0], a[1] + b[1]};
    }

    public double[] restarComplejos(double[] a, double[] b) {
        return new double[]{a[0] - b[0], a[1] - b[1]};
    }

    public double[] multiplicarPorEscalar(double[] a, double escalar) {
        return new double[]{a[0] * escalar, a[1] * escalar};
    }
}

