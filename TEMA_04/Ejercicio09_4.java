/**
 * Ejercicio 9 | Tema 4
 * Calcula las soluciones de una ecuación de segundo grado.
 * @author Lucia Blanco
 */
 
 public class Ejercicio09_4 { // Clase principal
  public static void main(String[] args) {
    /* Recibe las variables */
    System.out.print("Por favor, introduce la primera variable (no puede ser 0): ");
    double var1 = Double.parseDouble(System.console().readLine());
    if (var1 == 0){
      System.out.println("Por favor, dije que no puede ser 0: ");
    } else {
      System.out.print("Por favor, introduce la segunda variable: ");
      double var2 = Double.parseDouble(System.console().readLine());
      System.out.print("Por favor, introduce la tercera variable: ");
      double var3 = Double.parseDouble(System.console().readLine());
      /* Calcula las soluciones y las imprime */
      double x1 = (-var2 + Math.sqrt((var2*var2)-4*var1*var3))/(2*var1);
      double x2 = (-var2 - Math.sqrt((var2*var2)-4*var1*var3))/(2*var1);
      System.out.printf("Las soluciones de la ecuación %.2fx² + %.2fx + %.2f son x1= %.2f y x2= %.2f", var1, var2, var3, x1, x2);
    }
  }
}
