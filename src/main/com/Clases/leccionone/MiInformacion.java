/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.leccionone;

/**
 *
 * @author Vongola
 */
public class MiInformacion {
    /*
    🟢 Nivel Básico
    1️⃣ Crea un programa llamado MiInformacion.java que imprima:

    Tu nombre completo
    Tu edad
    Tu lenguaje de programación favorito
    Un mensaje motivador como:👉 “Estoy aprendiendo Java con disciplina y constancia.”
    */
    
    String nombre =  "Yuseth Muñoz";
    int edad = 25;
    String lenguajePreferido = "Varios";
    String mensaje = "Paso a Paso se va adquiriendo Conocimiento";

    public void mostrarPaso1(){
        System.out.println("Nombre Completo: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Lenguaje de Programación Favorito: " + lenguajePreferido);
        System.out.println("Mensaje Motivador: " + mensaje);
    }
    /*
    2️⃣ Declara variables que representen:

    Año de nacimiento (int)
    Promedio académico (double)
    Si tienes mascotas (boolean)
    Nombre de tu ciudad (String)
    Luego imprime todos los valores.
    */
    int anio = 2000;
    double promedio = 4.0;
    boolean mascota = true;
    String ciudad = "No importa XD";

    public void mostrarPaso2() {
        System.out.println("Año de nacimiento: "+anio);
        System.out.println("Mi promedio de estudio es "+promedio);
        System.out.println("Cuentas con mascota: "+mascota);
        System.out.println("Ciudad: "+ciudad);
    }
    /*
    🟠 Nivel Intermedio
    3️⃣ Crea un programa que calcule la edad de una persona a partir de su año de nacimiento.

    📘 Ejemplo de salida:
    Año de nacimiento: 2001
    Edad: 24 años

    💡 Pista: Usa una variable con el año actual (por ejemplo 2025) y réstale el año de nacimiento.
    */

    public void mostrarPaso3() {
        System.out.println("Año de nacimiento: "+anio);
        System.out.println("Edad: "+(2025-anio));
    }
    
    
}
