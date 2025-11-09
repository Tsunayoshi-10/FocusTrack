package controller;

import view.MenuView;

public class UsuarioController {
    // instancias de las clases que se usaran
    private MenuView menuView = new MenuView();

    public void iniciar() {
        int opcion;
        do {
            opcion = menuView.mostrarMenu();

            switch (opcion) {
                case 1:
                    System.out.println("Opción 1 seleccionada: Registrar Usuario");
                    // Lógica para registrar usuario
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada: Iniciar sesión");
                    // Lógica para iniciar sesión
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 3);
    }
}
