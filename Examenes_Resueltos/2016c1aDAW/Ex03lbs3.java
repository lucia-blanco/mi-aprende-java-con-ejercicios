/**
 * Ejercicio 3
 * 
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs3 { // Clase principal
  public static void main(String[] args) {
    // Fija el ancho de los escalones
    final String wConst = "****";
    // Pide datos
    System.out.print("Introduzca el número de escalones: ");
    int escUs = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la altura de cada escalón: ");
    int hUs = Integer.parseInt(System.console().readLine());
    // Empieza a dibujar
    for (int esc = 0; esc < escUs; esc++){
      for (int h = 0; h < hUs; h++){
        for (int w = 0; w <= esc; w++){
          System.out.print(wConst);
        }
        System.out.println();
      }
    }
  }
}
