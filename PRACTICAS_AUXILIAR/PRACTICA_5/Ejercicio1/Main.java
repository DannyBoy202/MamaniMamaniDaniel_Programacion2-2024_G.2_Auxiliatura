public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento("Concierto de Rock");

        // Registrar notificaciones usando expresiones lambda
        evento.registrarNotificacion(mensaje -> System.out.println("Notificación 1: " + mensaje));
        evento.registrarNotificacion(mensaje -> System.out.println("Notificación 2: " + mensaje));
        evento.registrarNotificacion(mensaje -> System.out.println("Notificación 3: " + mensaje));

        // Activar el evento
        evento.activar();
    }
}
    