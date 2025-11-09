package Clases.leccionone;

public class MotivacionDiaria {
    /*
    🔴 Reto Opcional

    Crea un programa llamado MotivacionDiaria.java que muestre un mensaje diferente según el día de la semana.

    Ejemplo de salida:
    Hoy es martes. ¡Sigue practicando, Pepe! Cada línea de código te acerca a tus metas.*/

    String mensajeLunes = "Hoy es lunes. ¡Comienza la semana con energía!";
    String mensajeMartes = "Hoy es martes. ¡Sigue practicando, Pepe! Cada línea de código te acerca a tus metas.";
    String mensajeMiercoles = "Hoy es miércoles. ¡Mitad de semana, no te rindas!";
    String mensajeJueves = "Hoy es jueves. ¡Estás haciendo un gran trabajo!";
    String mensajeViernes = "Hoy es viernes. ¡El fin de semana está cerca, sigue así!";
    String mensajeSabado = "Hoy es sábado. ¡Aprovecha el día para aprender algo nuevo!";
    String mensajeDomingo = "Hoy es domingo. ¡Prepárate para una nueva semana de aprendizaje!";

    public void mostrarMensaje(String dia){
        switch(dia.toLowerCase()){
            case "lunes":
                System.out.println(mensajeLunes);
                break;
            case "martes":
                System.out.println(mensajeMartes);
                break;
            case "miércoles":
                System.out.println(mensajeMiercoles);
                break;
            case "jueves":
                System.out.println(mensajeJueves);
                break;
            case "viernes":
                System.out.println(mensajeViernes);
                break;
            case "sábado":
                System.out.println(mensajeSabado);
                break;
            case "domingo":
                System.out.println(mensajeDomingo);
                break;
            default:
                System.out.println("Día no válido. Por favor ingresa un día de la semana.");
        }
    }

}
