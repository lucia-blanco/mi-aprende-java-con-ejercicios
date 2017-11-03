/**
 * Ejercicio 36 | Tema 5
 * Capicúa.
 * @author Lucia Blanco
 */
 
 public class Ejercicio36_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    long numUs = Long.parseLong(System.console().readLine());
    // Cuenta los números
    int numBasura = numUs;
    int numDig = 0;
    while (numBasura > 0){
      numBasura /=10;
      numDig++;
    }
    numBasura = numUs;
    int i = 0;
    while (i <= numDig/2){
    }
  }
}
