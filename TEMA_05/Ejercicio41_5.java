/**
 * Ejercicio 41 | Tema 5
 * Cuenta cifras pares e impares.
 * @author Lucia Blanco
 */
 
 public class Ejercicio41_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    long numUs = Long.parseLong(System.console().readLine());
    long numBasura = numUs;
    int numDig = 0;
    while (numBasura > 0){
      numBasura /=10;
      numDig++;
    }
    int pares = 0;
    int impares = 0;
    for (int i = 0; i < numDig ; i++){
      long cifra = numUs%10;
      if (cifra%2 == 0){
        pares++;
      } else {
        impares ++;
      }
      numUs /= 10;
    }
    System.out.print("En el número "+numUs+" hay "+pares+" cifras pares y "+impares+" cifras impares.");
  }
}
