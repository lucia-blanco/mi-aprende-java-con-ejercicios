/**
 * Ejercicio 24 | Tema 6
 * Dado un número introducido por teclado, elige al azar uno de sus dígitos.
 * @author Lucia Blanco
 */
 
 public class Ejercicio24_6 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numUs = Integer.parseInt(System.console().readLine());
    int numDigit;
    int num = numUs;
    for (numDigit = 0; numUs > 0; numDigit++){
      numUs = numUs/10;
    int dado = (int)(Math.random()*numDigit);
    
  }
}
