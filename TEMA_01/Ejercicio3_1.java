/**
 * Ejercicio 3 | Tema 1
 * Muestra 10 palabras en ingles junto con la tradución al castellano.
 * Las palabras deben estar en 2 columnas y alineadas a la izquierda.
 * @author Lucia Blanco
 */

public class Ejercicio3_1 {
  public static void main(String[] args) {
    System.out.println("  Español      Inglés");
    System.out.println("-----------------------------------------");
    System.out.printf("%-10s      %-10s\n",  "Manzana",  "Apple");
    System.out.printf("%-10s      %-10s\n",  "Pera",  "Pear");
    System.out.printf("%-10s      %-10s\n",  "Aguacate", "Avocado");
    System.out.printf("%-10s      %-10s\n",  "Zanahoria", "Carrot");
    System.out.printf("%-10s      %-10s\n",  "Piña", "Pinneaple");
    System.out.printf("%-10s      %-10s\n",  "Pepino", "Cucumber");
    System.out.printf("%-10s      %-10s\n",  "Calabaza", "Pumpkin");
    System.out.printf("%-10s      %-10s\n",  "Granada", "Pomegranate");
    System.out.printf("%-10s      %-10s\n",  "Limón", "Lemon");
  }
}
