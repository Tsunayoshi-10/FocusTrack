package view;

import java.util.Scanner;

public class MenuView {
    // Captura de datos en la consola para el menu
    Scanner scanner = new Scanner(System.in);

    /*
    * Metodo para mostrar el menú principal y capturar la opción del usuario
    * y retorna la opcion elegida
    */
    public int mostrarMenu() {
        int opcion;
        System.out.println("===== Menú Principal =====");
        System.out.println("1. Registrar Usuario");
        System.out.println("2. Iniciar sesión");
        System.out.println("3. Salir");
        System.out.println("\nSeleccione una opción: ");
        opcion = scanner.nextInt();
        return opcion;
    }



}
