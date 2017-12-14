/**
 * Ejercicio 9 | Tema 7
 * Pide 8 enteros y pinta "par" o "impar" al lado según proceda
 * @author Lucia Blanco
 */
  
 public class Ejercicio09_7 { // Clase principal
  public static void main(String[] args) {
    int[] numero = new int[8];
    System.out.print("Introduce 8 números: ");
    for (int i = 0; i < numero.length; i++){
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i < numero.length; i++){
      System.out.print(numero[i]);
      if (numero[i]% 2 == 0){
        System.out.println(" par");
      } else {
        System.out.println(" impar");
      }
    }
  }
}
