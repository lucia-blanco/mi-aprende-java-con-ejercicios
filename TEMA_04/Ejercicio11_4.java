/**
 * Ejercicio 11 | Tema 4
 * Dada una hora, dice los segundos que faltan para la medianoche.
 * @author Lucia Blanco
 */
 
 public class Ejercicio11_4 { // Clase principal
  public static void main(String[] args) {
    /* Lee la hora */
    System.out.print("Por favor, introduce la hora (formato 24h): ");
    int hora = Integer.parseInt(System.console().readLine());
    if ((0 < hora) && (hora > 23)) {
      System.out.println("El dato no es correcto");
    } else {
      System.out.print("Por favor, introduce los minutos: ");
      int min = Integer.parseInt(System.console().readLine());
        if ((0 < min) && (min > 59)) {
          System.out.println("El dato no es correcto");
        } else {
        /* En caso de que ya sea media noche */
        if ((hora == 0) && (min == 0)){
          System.out.println("Ya es medianoche");
        /* Demás casos */
        } else {
          int horaSec = (23 - hora)* 3600;
          int minSec = (60 - min)* 60;
          int medianoche = horaSec + minSec;
          System.out.println("Faltan " + medianoche + " segundos para medianoche.");
        }
      }
    }
  }
}
