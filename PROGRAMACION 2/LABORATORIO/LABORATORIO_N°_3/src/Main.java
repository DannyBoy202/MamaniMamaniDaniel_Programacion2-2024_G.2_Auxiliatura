public class Main {
    public static void main(String[] args) {
        // Prueba de las clases Author y Book
        Author author = new Author("Gabriel García Márquez");
        author.addBook(new Book("Cien Años de Soledad", author, 20.0));
        author.addBook("El Amor en los Tiempos del Cólera", 15.0);

        for (Book book : author.getBooks()) {
            System.out.println(book.getInfo());
        }

        // Prueba de las clases Vehicle y ElectricVehicle
        ElectricVehicle myEV = new ElectricVehicle("Tesla", "Model 3", 50000, 75, 500);
        myEV.start();
        myEV.displayInfo();
        myEV.displayRange();
        myEV.stop();
    }
}
