/**
 * Ejercicio 1 | Tema 6
 * Muestra la tirada de tres dados. Se debe mostrar también la suma total.
 * @author Lucia Blanco
 */
 
 public class Ejercicio01_6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Muestra la tirada de tres dados al azar:");
    int suma = 0;
    for (int i = 0; i < 3; i++){
      int dado = (int)(Math.random()*6) + 1;
      switch (dado){
        case 1:
          System.out.print("1");
          suma += dado;
          break;
        case 2:
          System.out.print("2");
          suma += dado;
          break;
        case 3:
          System.out.print("3");
          suma += dado;
          break;
        case 4:
          System.out.print("4");
          suma += dado;
          break;
        case 5:
          System.out.print("5");
          suma += dado;
          break;
        case 6:
          System.out.print("6");
          suma += dado;
          break;
        default:
        break;
      }
      System.out.print("\t");
    }
    System.out.println("Suma = " + suma);
  }
}
