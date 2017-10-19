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
    if (media < 5){
      boletin = "insuficiente";
    } else if (media < 6){
      boletin = "suficiente";
    } else if (media < 7){
      boletin = "bien";
    } else if (media < 9){
      boletin = "notable";
    } else if (media <= 10){
      boletin = "sobresaliente";
    } else {
      System.out.println("Una de las notas es incorrecta, vuelve a introducirlas.");
    }
    System.out.printf("Su nota en el boletín es: %s.", boletin);
  }
}
