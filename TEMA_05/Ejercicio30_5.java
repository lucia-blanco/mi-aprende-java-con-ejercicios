/**
 * Ejercicio 30 | Tema 5
 * Calcula las horas transcurridas entre dos horas de dos días de la semana.
 * @author Lucia Blanco
 */
 
 public class Ejercicio30_5 { // Clase principal
  public static void main(String[] args) {
    boolean datos = true;
    System.out.print("Introduce un día: ");
    String dia1Us = System.console().readLine().toLowerCase();
    System.out.print("Introduce la hora (exacta, sin minutos) del primer día: ");
    int hora1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un día posterior al primero: ");
    String dia2Us = System.console().readLine().toLowerCase();
    System.out.print("Introduce la hora del segundo día: ");
    int hora2 = Integer.parseInt(System.console().readLine());
    // Comprueba los datos
    int dia1 = 0;
    int dia2 = 0;
    int horas = 0;
    switch (dia1Us){
      case "1":
      case "lunes":
        dia1 = 1;
        break;
      case "2":
      case "martes":
        dia1 = 2;
        break;
      case "3":
      case "miercoles":
      case "miércoles":
        dia1 = 3;
        break;
      case "4":
      case "jueves":
        dia1 = 4;
        break;
      case "5":
      case "viernes":
        dia1 = 5;
        break;
      case "6":
      case "sabado":
      case "sábado":
        dia1 = 6;
        break;
      case "7":
      case "domingo":
        dia1 = 7;
        break;
      default:
        datos = false;
      }
      switch (dia2Us){
      case "1":
      case "lunes":
        dia2 = 1;
        break;
      case "2":
      case "martes":
        dia2 = 2;
        break;
      case "3":
      case "miercoles":
      case "miércoles":
        dia2 = 3;
        break;
      case "4":
      case "jueves":
        dia2 = 4;
        break;
      case "5":
      case "viernes":
        dia2 = 5;
        break;
      case "6":
      case "sabado":
      case "sábado":
        dia2 = 6;
        break;
      case "7":
      case "domingo":
        dia2 = 7;
        break;
      default:
        datos = false;
      }
    if ((hora1 < 0) || (hora1 > 23) || (hora1 < 0) || (hora1 > 23)){
      datos = false;
    } 
    if (dia1 == dia2){
      if (hora1 > hora2){
        datos = false;
      } else {
        horas = hora2 -hora1;
      }
    } else {
      horas = (24-hora2) + (hora1)+ ((dia2-dia1-1)*24);
    }
    if (datos){
      System.out.print("Las horas transcurridas entre los días introducidos son: "+horas);
    } else {
      System.out.print("Los datos introducidos son incorrectos. Por favor, revísalos");
    }
  }
}
