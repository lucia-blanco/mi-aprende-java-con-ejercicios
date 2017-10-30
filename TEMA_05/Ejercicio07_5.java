/**
 * Ejercicio 7 | Tema 5
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 * @author Lucia Blanco
 */
 
 public class Ejercicio07_5 { // Clase principal
  public static void main(String[] args) {
    int i = 4;
    int combUs;
    int comb = 0000;
    boolean acertado = false;
    do {
      System.out.print("Combinación: ");
      combUs = Integer.parseInt(System.console().readLine());
      if (combUs == comb) {
        acertado = true;
      } else {
        System.out.println("Combinación errónea");
      }
      i--;
    } while((i > 0) && (!acertado));
    if (acertado) {
      System.out.println("La cámara de los secretos ha sido abierta, enemigos del heredero... temed.");
    } else {
      System.out.println("Lo siento, has agotado tus 4 oportunidades.");
    }
  }
}

