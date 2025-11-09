package Clases.lecciontwo;

import java.util.Scanner;

public class programData {
    /*
    2️⃣ Crea un programa que pida tu nombre y tu edad y luego imprima un mensaje como:
    "Hola Pepe, dentro de 5 años tendrás 29 años."*/

    String nombre;
    int edad;

    Scanner entrada = new Scanner(System.in);

    public void mostrarDatos() {
        System.out.println("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresa tu edad: ");
        edad = entrada.nextInt();

        System.out.println("Hola "+nombre+" hoy cuentas con "+edad+" años y dentro de 5 años seras mas viejo y tendrás "+(edad + 5)+" años.");
    }
}