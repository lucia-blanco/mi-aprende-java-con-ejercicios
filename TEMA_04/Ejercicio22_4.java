/**
 * Ejercicio 22 | Tema 4
 * Dados un día y una hora, calcula los minutos que quedan para el fin de semana.
 * @author Lucia Blanco
 */
 
 public class Ejercicio22_4 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un día de la semana de lunes a viernes: ");
    String dia = System.console().readLine().toLowerCase();
    System.out.print("Por favor, introduce una hora en formato militar (las 10:46AM sería 1046): ");
    int horaUs = Integer.parseInt(System.console().readLine());
    int hora = (int)horaUs/100;
    int min = (horaUs - hora*100);
    if ((hora < 0) || (hora > 23) || (min < 0) || (min > 59)){
      System.out.println("Lo siento, el formato de la hora no es correcto");
    } else {
      int falta;
      switch (dia){
        case "lunes":
          falta = ((23-hora)*60+(60-min))+24*60*3+15*60;
          System.out.println("Faltan " + falta + " minutos para el fin de semana");
          break;
        case "martes":
          falta = ((23-hora)*60+(60-min))+24*60*2+15*60;
          System.out.println("Faltan " + falta + " minutos para el fin de semana");
          break;
        case "miércoles":
          falta = ((23-hora)*60+(60-min))+24+15*60;
          System.out.println("Faltan " + falta + "minutos para el fin de semana");
          break;
        case "jueves":
          falta = ((23-hora)*60+(60-min))+15*60;
          System.out.println("Faltan " + falta + " minutos para el fin de semana");
          break;
        case "viernes":
          falta = (14-hora)*60+(60-min);
          System.out.println("Faltan " + falta + " minutos para el fin de semana");
          break;
        default:
          System.out.println("El día '" + dia + "' no es válido.");
          break;
      }
    }
  }
}
