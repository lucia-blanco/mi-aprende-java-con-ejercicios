/**
 * Ejercicio 7 | Tema 4
 * Calcula la media de tres notas.
 * @author Lucia Blanco
 */
 
 public class Ejercicio07_4 { // Clase principal
  public static void main(String[] args) {
  
    /* Recibe notas */
    System.out.print("Por favor, introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    /* Calcula la media y la muestra */
    double media = (nota1+nota2+nota3)/3;
    System.out.printf("La media de %.2f, %.2f y %.2f = %.2f", nota1, nota2, nota3, media);
    
  }
}
