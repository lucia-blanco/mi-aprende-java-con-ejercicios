/**
 * Ejercicio 9 | Tema 3
 * Recibe la base y altura de un cono y calcula su volumen;
 * @author Lucia Blanco
 */

public class Ejercicio09_3 { // Clase principal
  public static void main(String[] args) {
    String linea;
    double pi = Math.PI;
    /* Recibe el radio y la altura del cono */
    System.out.print("Por favor, introduce el radio de la base del cono (en centímetros): ");
    linea = System.console().readLine();
    double radio = Double.parseDouble(linea);
    System.out.print("Por favor, introduce la altura del cono (en centímetros): ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    /*Calcula el volumen y lo muestra */
    double vol = (pi*(radio*radio)*altura)/3;
    System.out.println("El volumen del cono de radio "+radio+" y altura "+altura+" es "+vol+" cm³);
  }
}
