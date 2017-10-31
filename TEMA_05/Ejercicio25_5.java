/**
 * Ejercicio 25 | Tema 5
 * Número al revés.
 * @author Lucia Blanco
 */
 
 public class Ejercicio25_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("El número "+num+" al revés es: ");
    int div = 10;
    while (num > 0){
      int reves = num%div;
      System.out.print(reves);
      num = (num - reves*(div/10))/10;
    }
  }
}
