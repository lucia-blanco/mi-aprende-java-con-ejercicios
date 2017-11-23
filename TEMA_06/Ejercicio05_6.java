/**
 * Ejercicio 5 | Tema 6
 * Muestra 50 números enteros aleatorios entre 100 y 199. Escribe máximo, mínimo, media.
 * @author Lucia Blanco
 */
 
 public class Ejercicio05_6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Muestra 50 números enteros aleatorios entre 100 y 199:");
    int max = 0;
    int min = 199;
    int dividendo = 0;
    int divisor = 0;
    for (int i = 0; i < 50; i++){
      int num = (int)(Math.random()*100) + 100;
      System.out.print(num + " ");
      if (num > max){
        max = num;
      } else if (num < min){
        min = num;
      }
      dividendo += num;
      divisor++;
    }
    System.out.println();
    System.out.println("Mínimo: " + min);
    System.out.println("Máximo: " + max);
    double media = (double)(dividendo)/(double)(divisor);
    System.out.println("Media: " + media);
  }
}
    
