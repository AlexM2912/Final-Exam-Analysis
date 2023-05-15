package co.edu.upb.finalExam;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de la vista y la librería
        BookstoreView bookstoreView = new BookstoreView();
        Bookstore bookstore = new Bookstore();

        // Crear objeto del controlador y pasarlo la vista y la librería
        ControllerLibrary controller = new ControllerLibrary(bookstoreView, bookstore);

        // Ciclo principal de la aplicación
        boolean exit = false;
        while (!exit) {
            // Mostrar el menú y obtener la opción seleccionada
            int option = bookstoreView.displayMenuAndGetOption();

            // Procesar la acción seleccionada por el usuario
            controller.processAction(option);
        }
    }
}
