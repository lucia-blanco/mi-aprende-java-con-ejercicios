/**
 * Ejercicio 2 | Tema 6
 * Muestra al azar el nombre de una carta de la baraja francesa.
 * @author Lucia Blanco
 */
 
 public class Ejercicio02_6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Muestra al azar el nombre de una carta de a baraja francesa:");
    int numPalo = (int)(Math.random()*4) + 1;
    String palo = "a";
    switch (numPalo){
      case 1:
        palo = "corazones";
        break;
      case 2:
        palo = "diamantes";
        break;
      case 3:
        palo = "picas";
        break;
      case 4:
        palo = "tréboles";
        break;
      default:
      break;
    }
    int numCarta = (int)(Math.random()*13) + 1;
    String carta = "a";
    switch (numCarta){
      case 1:        
        carta = "A";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
        carta = String.valueOf(numCarta);
      break;
    }
    System.out.println(carta + " de " + palo);
  }
}
