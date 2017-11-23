/**
 * Ejercicio 6 | Tema 6
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades.
 * @author Lucia Blanco
 */
 
 public class Ejercicio06_6 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Intenta adivinar el número (entre 0 y 100) que estoy pensando: ");
    int num = (int)(Math.random()*101);
    int i = 1;
    final int intentos = 5;
    boolean acertado = false;
    while(i <= intentos){
      int numUs = Integer.parseInt(System.console().readLine());
      if (num == numUs){
        acertado = true;
        System.out.println("ENHORABUENA, HAS ACERTADO");
      }
      if (!acertado){
        if (num < numUs){
          System.out.println("El número que estoy pensando es más pequeño.");
        } else {
          System.out.println("En número que estoy pensando es más grande.");
        }
        System.out.println("Te quedan " + (intentos-i) + " oportunidades.");
        if (i < 8){
          System.out.print("Vuelve a intentarlo: ");
        }
      }
      i++;
    }
    System.out.println("El número era el: " + num);
  }
}
