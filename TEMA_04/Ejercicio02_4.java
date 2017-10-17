/**
 * Ejercicio 2 | Tema 4
 * Pide una hora y devuelve buenos días/tardes/noches.
 * @author Lucia Blanco
 */
 
 public class Ejercicio02_4 { // Clase principal
  public static void main(String[] args) {
    
    /* Recoge la hora */
    System.out.print("Por favor, introduce la hora (con un número entero, sin minutos): ");
    int hora = Integer.parseInt(System.console().readLine());
    /* Calcula el tramo en el que está */
    if ((hora >= 6)&&(hora <= 12)){
      System.out.print("Buenos días.");
    } 
    else if ((hora >= 13)&&(hora <= 20)){
      System.out.print("Buenas tardes.");
    } 
    else if ((hora >= 21)&&(hora <= 23)){
      System.out.print("Buenas noches.");
    } 
    else if ((hora >= 0)&&(hora <= 5)){
      System.out.print("Buenas noches.");
    } 
    else {
      System.out.print("Revisa el formato, porque no lo introdujiste correctamente.");
    }
  }
}
