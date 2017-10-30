/**
 * Ejercicio 12 | Tema 5
 * Fibonacci.
 * @author Lucia Blanco
 */
 
 public class Ejercicio12_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número ");
    int cifras = Integer.parseInt(System.console().readLine());
    int num1 = 0;
    int num2 = 1;
    int fibo = 0;
    System.out.print("Las primeras "+cifras+" de la serie de Fibonacci son: "+ num1+" "+num2+ " ");
    for (int i = 0; i < cifras; i++){
      fibo = num1 + num2;
      System.out.print(" "+fibo+" ");
      num1 = num2;
      num2 = fibo;
    }
  }
}
