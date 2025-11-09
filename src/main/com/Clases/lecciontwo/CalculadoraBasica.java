package Clases.lecciontwo;

import java.util.Scanner;

public class CalculadoraBasica {
    /*
    🟢 Nivel Básico
    1️⃣ Crea un programa llamado CalculadoraBasica.java que:

    Pida dos números por teclado.
    Muestre la suma, resta, multiplicación y división de esos números.

    📘 Ejemplo:

    Ingresa el primer número: 8
    Ingresa el segundo número: 2
    Suma: 10
    Resta: 6
    Multiplicación: 16
    División: 4.0*/

    Scanner entrada = new Scanner(System.in);
    int numero1, numero2;

    public void mostrarOperaciones(){
        System.out.print("Ingresa el primer número: ");
        numero1 = entrada.nextInt();
        System.out.print("Ingresa el segundo número: ");
        numero2 = entrada.nextInt();

        int suma = numero1 +  numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
