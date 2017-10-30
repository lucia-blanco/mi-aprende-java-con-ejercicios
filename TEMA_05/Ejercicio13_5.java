/**
 * Ejercicio 13 | Tema 5
 * En una lista de 10 números, dice cuál es positivo y cuál negativo.
 * @author Lucia Blanco
 */
 
 public class Ejercicio13_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número ");
    int cifras = Integer.parseInt(System.console().readLine());
    int numCifras = 10;
    int positivos = 0;
    int negativos = 0;
    for (int cont = 0; cont < numCifras; cont++){
      if (cifras < 0){
        positivos ++;
      } else {
        negativos++;
      }
    }
    System.out.println("Hay "+positivos+" positivios y "+negativos+" negativos.");
  }
}
