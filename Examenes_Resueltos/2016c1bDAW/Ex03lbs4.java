/**
 * Ejercicio 4
 * 
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs4 { // Clase principal
  public static void main(String[] args) {
    final String con = "    ";
    final String sin = "****";
    System.out.print("Introduzca la altura de la pirámide maya: ");
    int h = Integer.parseInt(System.console().readLine());
    for (int fil = 1; fil <= h; fil++){
      for (int espacio = 0; espacio < (h - fil); espacio++){
        System.out.print(" ");
      }
      for (int asterisco = 0; asterisco < fil; asterisco++){
        System.out.print("*");
      }
      if (fil%2 == 0){
        System.out.print(con);
      } else {
        System.out.print(sin);
      }
      for (int asteris = 0; asteris < fil; asteris++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
