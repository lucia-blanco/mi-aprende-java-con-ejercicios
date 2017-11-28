/**
 * Ejercicio 18 | Tema 6
 * Habitaciones de colores.
 * @author Lucia Blanco
 */
 
 public class Ejercicio18_6 { // Clase principal
  public static void main(String[] args) {
    final int numHabitaciones = 3;
    String color1 = "";
    String color2 = "";
    String color3 = "";
    String color = "";
    int numColor = 0;
    int i = 0;
    while (i < numHabitaciones){
      numColor = (int)(Math.random()*5);
      switch (numColor){
        case 0:
          color = "rojo";
          break;
        case 1:
          color = "azul";
          break;
        case 2:
          color = "verde";
          break;
        case 3:
          color = "amarillo";
          break;
        case 4:
          color = "violeta";
          break;
        default:
          color = "naranja";
      }
      if (i == 0){
        color1 = color;
        i++;
      } else if ((i == 1) && (color1 != color)){
        color2 = color;
        i++;
      } else if ((i == 2) && (color1 != color) && (color2 != color)){
        color3 = color;
        i++;
      }
    }
    System.out.println("Color de la primera habitación: " + color1);
    System.out.println("Color de la segunda habitación: " + color2);
    System.out.println("Color de la tercera habitación: " + color3);
  }
}
