/**
 * Ejercicio 19 | Tema 6
 * Genera 50 números aleatorios [-100, 200] y calcula max pares, min impares y media de todos.
 * @author Lucia Blanco
 */
 
 public class Ejercicio19_6 { // Clase principal
  public static void main(String[] args) {
    final int numDeNum = 50;
    int max = 0;
    int min = 200;
    int sumatorio = 0;
    for (int i = 0; i < numDeNum; i++){
      int numAleatorio = (int)((Math.random()*300)-100);
      System.out.print(numAleatorio + " ");
      sumatorio += numAleatorio;
      if (numAleatorio%2 == 0){
        if (max < numAleatorio){
          max = numAleatorio;
        }
      } else {
        if (min > numAleatorio){
          min = numAleatorio;
        }
      }
    }
    System.out.println("");
    double media = ((double)(sumatorio)/50.0);
    System.out.println("El máximo par es: " + max);
    System.out.println("El mínimo impar es: " + min);
    System.out.println("La media es: " + media);
  }
}
