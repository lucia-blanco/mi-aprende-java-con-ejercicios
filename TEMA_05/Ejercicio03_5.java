/**
 * Ejercicio 3 | Tema 5
 * Imprime todos los múltiplos de 5 del 0 al 100 (con do while).
 * @author Lucia Blanco
 */
 
 public class Ejercicio03_5 { // Clase principal
  public static void main(String[] args) {
    int i = 1;
    do {
      if (i%5==0){
        System.out.print(i+" ");
      }
      i++;
    } while (i<=100);
  }
}
