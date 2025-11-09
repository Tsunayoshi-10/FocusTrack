package view;

import controller.UsuarioController;

public class Main {

    public static void main(String[] args) {
        System.out.println("\uD83D\uDE80 Iniciando FocusTrack...");
        System.out.println(".......................................");
        System.out.println(".......................................");
        System.out.println("Bienvenido a FocusTrack!");

        // llamamos la instancia y el metodo para iniciar la aplicacion
        UsuarioController controller = new UsuarioController();
        controller.iniciar();
    }

}
