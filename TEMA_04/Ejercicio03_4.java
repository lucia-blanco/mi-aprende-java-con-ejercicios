/**
 * Ejercicio 3 | Tema 4
 * Pide un número y devuelve día de la semana.
 * @author Lucia Blanco
 */
 
 public class Ejercicio03_4 { // Clase principal
  public static void main(String[] args) {
    
    /* Recoge número */
    System.out.print("Por favor, introduce un número (del 1 al 7): ");
    int diaSem = Integer.parseInt(System.console().readLine());
    /* Switch para encontrar día */
    switch (diaSem){
        case 1:
          System.out.print("Lunes");
          break;
        case 2:
          System.out.print("Martes");
          break;
        case 3:
          System.out.print("Miércoles");
          break;
        case 4:
          System.out.print("Jueves");
          break;
        case 5:
          System.out.print("Viernes");
          break;
        case 6:
          System.out.print("Sábado");
          break;
        case 7:
          System.out.print("Domingo");
          break;
        default:
          System.out.print("¿Qué parte de número del 1 al 7 no entendiste?");
    }
  }
}
