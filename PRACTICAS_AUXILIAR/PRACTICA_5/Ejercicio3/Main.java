public class Main {
    public static void main(String[] args) {
        Aventura aventura = new Aventura();

        // Agregar tareas usando expresiones lambda
        aventura.agregarTarea(() -> System.out.println("Tarea 1: Recoger la espada"));
        aventura.agregarTarea(() -> System.out.println("Tarea 2: Derrotar al dragón"));
        aventura.agregarTarea(() -> System.out.println("Tarea 3: Rescatar a la princesa"));

        // Iniciar la aventura
        aventura.iniciar();
    }
}
