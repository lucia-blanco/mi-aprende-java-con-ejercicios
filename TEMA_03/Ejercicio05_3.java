/**
 * Ejercicio 5 | Tema 3
 * Recibe la altura y anchura de un rectángulo y calcula su área.
 * @author Lucia Blanco
 */

public class Ejercicio05_3 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recibe la altura del rectángulo */
    System.out.print("Por favor, introduce la altura del rectángulo: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    /* Recibe la base del rectángulo */
    System.out.print("Por favor, introduce la anchura del rectángulo: ");
    linea = System.console().readLine();
    double anchura = Double.parseDouble(linea);
    /* Calcula el área y la muestra */
    double area = anchura*altura;
    System.out.println("La anchura del rectángulo de ("+anchura+"x"+altura+") es: "+area);
  }
}
