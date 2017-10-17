/**
 * Ejercicio 8 | Tema 4
 * Calcula la media de tres notas y dice la nota del boletín.
 * @author Lucia Blanco
 */
 
 public class Ejercicio08_4 { // Clase principal
  public static void main(String[] args) {
    String boletin = "a";
    /* Recibe notas */
    System.out.print("Por favor, introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    /* Calcula la media */
    double media = (nota1+nota2+nota3)/3;
    /* if para decir la nota */
    if ((media >= 0)&&(media <=4.99)){
      boletin = "insuficiente";
    } 
    else if ((media >= 5)&&(media <=5.99)){
      boletin = "suficiente";
    } 
    else if ((media >= 6)&&(media <=6.99)){
      boletin = "bien";
    } 
    else if ((media >= 7)&&(media <=8.99)){
      boletin = "notable";
    } 
    else if ((media >= 9)&&(media <=10)){
      boletin = "sobresaliente";
    } else {
      boletin = "errónea, revisa los datos";
    }
    System.out.printf("Su nota en el boletín es: %s.", boletin);
  }
}
