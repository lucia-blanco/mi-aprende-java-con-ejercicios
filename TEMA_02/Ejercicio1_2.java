/**
 * Ejercicio 1 | Tema 2
 * Muestra la suma, resta, multiplicación y división de 144 y 999.
 * @author Lucia Blanco
 */

public class Ejercicio1_2 { // Clase principal
  public static void main(String[] args) {
    int x = 144;
    int y = 999;
    /* Calcula e imprime las operaciones */
    double division = (double)x/(double)y;
    System.out.println("x = " +x+"  y = "+y);
    System.out.println("x+y = "+(x+y)+"  x-y = "+(x-y));
    System.out.println("x*y = "+(x*y)+ "  x/y = "+division);
  }
}
