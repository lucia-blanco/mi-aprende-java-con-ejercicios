/**
 * Ejercicio 9 | Tema 6
 * Va generando números aleatorios pares entre 0 y 100 y que no termina hasta que no saque el 24.
 * @author Lucia Blanco
 */
 
 public class Ejercicio09_6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Genera números aleatorios pares entre 0 y 100 y que no termina hasta que no saque el 24:");
    boolean veinticuatro = false;
    int contador = 0;
    while (!veinticuatro){
      int num = (int)(Math.random()*100);
      if (num%2 == 0){
        System.out.print(num + " ");
        contador ++;
        if (num == 24){
          veinticuatro = true;
        }
      }
    }
    System.out.println("\n Se han generado " + contador + " números aleatorios pares antes de encontrar el 24");
  }
}
