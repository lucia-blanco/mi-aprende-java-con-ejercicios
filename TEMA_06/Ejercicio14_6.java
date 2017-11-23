/**
 * Ejercicio 14 | Tema 6
 * El programa intentará adivinar el número que estás pensando.
 * @author Lucia Blanco
 */
 
 public class Ejercicio14_6 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Piensa un número (entre 0 y 100) e intentaré adivinarlo: ");
    int i = 1;
    final int intentos = 5;
    boolean acertado = false;
    while(i <= intentos){
      int num = (int)(Math.random()*101);
      System.out.println("¿Es el " + num + "?");
      System.out.println("[s] Sí  |  [+] Tu número es mayor  |  [-] Tu número es menor");
      String opcion = "";
      opcion = System.console().readLine();
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
