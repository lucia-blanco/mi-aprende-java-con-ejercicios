/**
 * Ejercicio 13 | Tema 4
 * Ordena tres números de menor a mayor.
 * @author Lucia Blanco
 */
 
 public class Ejercicio13_4 { // Clase principal
  public static void main(String[] args) {
    /* Lee números */
    System.out.print("Por favor, introduce un número: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduce un número: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduce un número: ");
    int c = Integer.parseInt(System.console().readLine());
    System.out.print("Ordenados de menor a mayor: ");
    /* Los ordena de menor a mayor */
    if ((a <= b) && (a <= c)){
      System.out.print(a + " < ");
      if (b <= c){
        System.out.print(b + " < " +c);
      } else {
        System.out.print(c + " < " + b);
      }
    } else if ((b <= a) && (b <= c)){
      System.out.print(b + " < ");
      if (a <= c){
        System.out.print(a + "<" + c);
      } else {
        System.out.print(c + "<" + a);
      }
    } else if ((c <= a) && (c <= b)){
      System.out.print(c +" < ");
      if (a <= b){
        System.out.print(a + " < " + b);
      } else {
        System.out.print(b + " < " + a);
      }
    }
  }
}
