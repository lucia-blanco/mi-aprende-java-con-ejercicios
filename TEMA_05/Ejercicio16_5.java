/**
 * Ejercicio 16 | Tema 5
 * Dice si un número introducido por teclado es o no primo.
 * @author Lucia Blanco
 */
 
 public class Ejercicio16_5 { // Clase principal
  public static void main(String[] args) {
  boolean primo = true;
  System.out.print("Introduce el numero ");
  int num = Integer.parseInt(System.console().readLine());
    for (int i = 2; i < num-1; i++){
      if ((num%i) == 0){
        primo = false;
      } else {
        primo = true;
      }
    }
    System.out.print("El número introducido ");
    if (primo == true){
      System.out.print("es primo.");
    } else {
      System.out.print("no es primo.");
    }
  }
}
