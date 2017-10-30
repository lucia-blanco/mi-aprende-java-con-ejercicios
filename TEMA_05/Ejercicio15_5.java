/**
 * Ejercicio 15 | Tema 5
 * Dadas una base y un exponente por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido
 * @author Lucia Blanco
 */
 
 public class Ejercicio15_5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce la base ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el exponente ");
    int exponente = Integer.parseInt(System.console().readLine());
    double total = 1;
    for(int i = 0; i < exponente; i++){
      total = base * total;
      System.out.println(base+ " elevado a "+ exponente+" = "+total+".");
    }
  }
}
