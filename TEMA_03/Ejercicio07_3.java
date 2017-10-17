/**
 * Ejercicio 7 | Tema 3
 * Recibe una base imponible y calcula el total de la factura.
 * @author Lucia Blanco
 */

public class Ejercicio07_3 { // Clase principal
  public static void main(String[] args) {
    final int IVA = 21;
    String linea;
    
    /* Recoge la base imponible */
    System.out.print("Por favor, introduce la base imponible: ");
    linea = System.console().readLine();
    double baseImp = Double.parseDouble(linea);
    /* Calcula el total de la factura y lo muestra */
    double totalFac = ((baseImp*IVA/100)+baseImp);
    System.out.printf("El total sin IVA es: "+baseImp+ "\n");
    System.out.printf("El total con IVA es: "+totalFac+ "\n");
  }
}
