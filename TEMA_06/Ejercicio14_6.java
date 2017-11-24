/**
 * Ejercicio 14 | Tema 6
 * El programa intentará adivinar el número que estás pensando.
 * @author Lucia Blanco
 */
 
 public class Ejercicio14_6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Piensa un número (entre 0 y 100) e intentaré adivinarlo: ");
    int i = 1;
    final int intentos = 8;
    boolean acertado = false;
    int maxim = 100;
    int minim = 0;
    while((i <= intentos)&&(!acertado)){
      int num = (int)(Math.random()*(maxim-minim+1))+minim;
      System.out.println("¿Es el " + num + "?");
      System.out.println("[s] Sí  |  [+] Tu número es mayor  |  [-] Tu número es menor");
      String opcion = "";
      opcion = System.console().readLine().toLowerCase();
      switch(opcion){
        case "s":
          acertado = true;
          System.out.println("¡Demasiado fácil!");
          break;
        case "+":
          minim = num+1;
          break;
        case "-":
          maxim = num-1;
          break;
        default:
          System.out.println("Comando no disponible");
          i--;
          break;
      }
      if ((minim > maxim) || (maxim < minim)){
        System.out.println("No seas tramposo");
        i--;
      }
      i++;
    }
    if (!acertado){
      System.out.println("GG WP");
    }
  }
}
