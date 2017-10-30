/**
 * Ejercicio 2 | Tema 5
 * Imprime todos los múltiplos de 5 del 0 al 100 (con while).
 * @author Lucia Blanco
 */
 
 public class Ejercicio02_5 { // Clase principal
  public static void main(String[] args) {
    int i = 1;
    while (i<=100){
      if (i%5==0){
        System.out.print(i+" ");
      }
      i++;
    }
  }
}
