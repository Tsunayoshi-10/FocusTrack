package Clases.lecciontwo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ConversorMonedas {
    /*
    🔴 Reto Opcional

    Crea un programa llamado ConversorMonedas.java que:
    Pida un valor en pesos colombianos.
    Lo convierta a dólares y euros (usa tasas fijas, por ejemplo: 1 USD = 4000 COP, 1 EUR = 4300 COP).
    Muestre el resultado.*/

    double dolar, euro, pesos;
    final double tasaDolar = 4000.0;
    final double tasaEuro = 4300.0;

    Scanner moneda = new Scanner(System.in);

    public void mostrarconversion(){
        System.out.println("Ingresa el valor en pesos colombianos: ");
        pesos = moneda.nextDouble();

        dolar = pesos / tasaDolar;
        euro = pesos / tasaEuro;
        System.out.println(pesos + " COP equivalen a: ");
        System.out.println(dolar + " USD");
        System.out.println(euro + " EUR");
    }
}
