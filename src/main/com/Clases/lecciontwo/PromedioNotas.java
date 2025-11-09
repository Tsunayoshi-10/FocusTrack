package Clases.lecciontwo;

import java.util.Scanner;

public class PromedioNotas {
    /*
    🟠 Nivel Intermedio
    3️⃣ Crea un programa llamado PromedioNotas.java que:

    Pida tres notas decimales.
    Calcule el promedio.
    Muestre si el estudiante aprobó o reprobó (usa el promedio ≥ 3.0).

    📘 Ejemplo:

    Ingresa la primera nota: 4.0
    Ingresa la segunda nota: 3.5
    Ingresa la tercera nota: 2.8
    Promedio: 3.43
    Resultado: ¡Aprobaste!

    💡 Pista: Usa un if para la condición (verás más en la próxima lección 😉) */

    double nota1, nota2, nota3, promedio;
    Scanner data = new Scanner(System.in);

    public void calcularPromedio(){
        System.out.print("Ingresa la primera nota: ");
        nota1 = data.nextDouble();
        System.out.print("Ingresa la segunda nota: ");
        nota2 = data.nextDouble();
        System.out.print("Ingresa la tercera nota: ");
        nota3 = data.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Promedio: "+ promedio);

        if(promedio >= 3.0){
            System.out.println("Resultado: ¡Aprobaste!");
        } else {
            System.out.println("Resultado: Reprobaste.");
        }
    }

}
