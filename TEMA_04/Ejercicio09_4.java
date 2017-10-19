/**
 * Ejercicio 9 | Tema 4
 * Calcula las soluciones de una ecuación de segundo grado.
 * @author Lucia Blanco
 */
 
 public class Ejercicio09_4 { // Clase principal
  public static void main(String[] args) {

    /* Recibe las variables */
    System.out.print("Por favor, introduce la primera variable: ");
    double var1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la segunda variable: ");
    double var2 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la tercera variable: ");
    double var3 = Double.parseDouble(System.console().readLine());
    if ((var1 == 0) && (var2 != 0) && (var3 != 0)){
      double x = (-var2)/var1;
      System.out.printf("La solución de la ecuación %.2fx + %.2f = %.2f", var2, var3, x);
    } else {
        if ((4*var1*var3) > (var2*var2)){
          System.out.print("La ecuación no tiene solución en ℝ.");
        } else if ((var1 == 0) && (var2 == 0) && (var3 == 0)){
          System.out.print("La ecuación es una identidad.");
        } else {
          /* Calcula las soluciones y las imprime */
          double x1 = (-var2 + Math.sqrt((var2*var2)-4*var1*var3))/(2*var1);
          double x2 = (-var2 - Math.sqrt((var2*var2)-4*var1*var3))/(2*var1);
          System.out.printf("Las soluciones de la ecuación %.2fx² + %.2fx + %.2f son x1= %.2f y x2= %.2f", var1, var2, var3, x1, x2);
        }
      }
    }
  }

