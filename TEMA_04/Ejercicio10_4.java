/**
 * Ejercicio 10 | Tema 4
 * Muestra el horóscopo a partir de una fecha (día y mes).
 * @author Lucia Blanco
 */
 
 public class Ejercicio10_4 { // Clase principal
  public static void main(String[] args) {
    String horoscopo = "erróneo, revisa los datos porque algo hiciste mal.";
    /* Recoge mes */
    System.out.print("Por favor, introduce el mes de nacimiento (número): ");
    int mesNac = Integer.parseInt(System.console().readLine());
    /* Recoge día */
    System.out.print("Por favor, introduce el día de nacimiento: ");
    int diaNac = Integer.parseInt(System.console().readLine());
    /* Switch para encontrar horóscopo */
    switch (mesNac){
      case 1:
        if ((diaNac >=1)&&(diaNac <= 19)){
          horoscopo = "Capricornio ♑";
        }
        else if ((diaNac >=20)&&(diaNac <= 31)){
          horoscopo = "Acuario ♒";
        }
        break;
      case 2:
        if ((diaNac >=1)&&(diaNac <= 18)){System.out.print("Por favor, introduce el mes de nacimiento (número): ");
          horoscopo = "Acuario ♒";
        }
        else if ((diaNac >=19)&&(diaNac <= 29)){
          horoscopo = "Piscis ♓";
        }
        break;
      case 3:
        if ((diaNac >=1)&&(diaNac <= 20)){
          horoscopo = "Piscis ♓";
        }
        else if ((diaNac >=21)&&(diaNac <= 31)){
          horoscopo = "Aries ♈";
        }
        break;
      case 4:
        if ((diaNac >=1)&&(diaNac <= 19)){
          horoscopo = "Aries ♈";
        }
        else if ((diaNac >=20)&&(diaNac <= 30)){
          horoscopo = "Tauro ♉";
        }
        break;
      case 5:
        if ((diaNac >=1)&&(diaNac <= 20)){
          horoscopo = "Tauro ♉";
        }
        else if ((diaNac >=21)&&(diaNac <= 31)){
          horoscopo = "Géminis ♊";
        }
        break;
      case 6:
        if ((diaNac >=1)&&(diaNac <= 20)){
          horoscopo = "Géminis ♊";
        }
        else if ((diaNac >=21)&&(diaNac <= 30)){
          horoscopo = "Cáncer ♋";
        }
        break;
      case 7:
        if ((diaNac >=1)&&(diaNac <= 22)){
          horoscopo = "Cáncer ♋";
        }
        else if ((diaNac >=23)&&(diaNac <= 31)){
          horoscopo = "Leo ♌";
        }
        break;
      case 8:
        if ((diaNac >=1)&&(diaNac <= 22)){
          horoscopo = "Leo ♌";
        }
        else if ((diaNac >=23)&&(diaNac <= 31)){
          horoscopo = "Virgo ♍";
        }
        break;
      case 9:
        if ((diaNac >=1)&&(diaNac <= 22)){
          horoscopo = "Virgo ♍";
        }
        else if ((diaNac >=23)&&(diaNac <= 30)){
          horoscopo = "Libra ♎";
        }
        break;
      case 10:
        if ((diaNac >=1)&&(diaNac <= 22)){
          horoscopo = "Libra ♎";
        }
        else if ((diaNac >=23)&&(diaNac <= 30)){
          horoscopo = "Escorpio ♏";
        }
        break;
      case 11:
        if ((diaNac >=1)&&(diaNac <= 21)){
          horoscopo = "Escorpio ♏";
        }
        else if ((diaNac >=22)&&(diaNac <= 30)){
          horoscopo = "Sagitario ♐";
        }
        break;
      case 12:
        if ((diaNac >=1)&&(diaNac <= 22)){
          horoscopo = "Sagitario ♐";
        }
        else if ((diaNac >=22)&&(diaNac <= 30)){
          horoscopo = "Capricornio ♑";
        }
        break;
      default:
        horoscopo = "erróneo, revisa los datos porque algo hiciste mal.";
    }
    System.out.println("Su signo del zodiaco es: " + horoscopo);
  }
}

