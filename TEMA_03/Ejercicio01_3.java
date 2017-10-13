/**
 * Ejercicio 1 | Tema 3
 * Recibe dos números y los multiplica
 * @author Lucia Blanco
 */

public class Ejercicio01_3 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recoge el primer número*/
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero = Integer.parseInt(linea);
    /* Recoge el segundo número*/
    System.out.print("Introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero = Integer.parseInt(linea);
    /* Realiza la operación y la muestra en pantalla */
    int total = primerNumero*segundoNumero;
    System.out.printf("%d * %d  %d", primerNumero, segundoNumero, total);
  }
}
