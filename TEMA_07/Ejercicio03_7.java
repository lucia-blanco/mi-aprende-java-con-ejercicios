/**
 * Ejercicio 3 | Tema 7
 * Lee 10 números por teclado y que luego los muestre en orden inverso, 
 * es decir, el primero que se introduce es el último en mostrarse y viceversa.
 * @author Lucia Blanco
 */
 
 public class Ejercicio03_7 { // Clase principal
  public static void main(String[] args) {
    int[] matriz = new int[10];
    for (int i = 0; i < 10; i++){
      System.out.print("Introduce el valor del array: ");
      matriz[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    for (int i = 9; i >= 0; i--){
      System.out.print(matriz[i]+" ");
    }
  }
}
    
    
