/**
 * Ejercicio 1 | Tema 4
 * Pide día de la semana y devuelve asignatura que hay a primera hora.
 * @author Lucia Blanco
 */

public class Ejercicio01_4 { // Clase principal
  public static void main(String[] args) {
    
    String diaSem;
    /* Recoge dia de la semana */
    System.out.print("Por favor, introduce un dia de la semana (lunes a viernes) en minúsculas: ");
    diaSem = System.console().readLine();
    /* Switch para encontrar asignatura */
    switch (diaSem){
        case "lunes":
          System.out.print("Hay Sistemas Informáticos.");
          break;
        case "martes":
          System.out.print("Hay Programación.");
          break;
        case "miércoles":
          System.out.print("Hay Sistemas Informáticos.");
          break;
        case "jueves":
          System.out.print("Hay Programación.");
          break;
        case "viernes":
          System.out.print("Hay Programación.");
          break;
        default:
          System.out.print("¿Qué parte de dia de la semana (lunes a viernes) en minúsculas no entendiste?");
    }
  }
}

