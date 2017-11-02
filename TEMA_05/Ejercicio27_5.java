/**
 * Ejercicio 27 | Tema 5
 * Muestra, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado.
 * @author Lucia Blanco
 */
 
 public class Ejercicio27_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int numUs = Integer.parseInt(System.console().readLine());
    int suma = 0;
    for (int i = 1; i < numUs; i++){
      if (numUs%3 == 0){
        suma += numUs;
      }
    }
  }
}
