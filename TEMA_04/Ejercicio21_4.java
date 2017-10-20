/**
 * Ejercicio 21 | Tema 4
 * Calcula media con recuperación.
 * @author Lucia Blanco
 */
 
 public class Ejercicio21_4 { // Clase principal
  public static void main(String[] args) {
    /* Recibe notas */
    System.out.print("Por favor, introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    if ((nota1 < 0) || (nota1 > 10)){
      System.out.print("Este valor no es válido.");
    } else {
      System.out.print("Por favor, introduce la segunda nota: ");
      double nota2 = Double.parseDouble(System.console().readLine());
        if ((nota2 < 0) || (nota2 > 10)){
        System.out.print("Este valor no es válido.");
        } else {
          double notaFin = (nota1 + nota2)/2;
          if (notaFin < 5){
          System.out.print("¿Cuál es el resultado de la recuperación? (apto/no apto) ");
          String recu = System.console().readLine().toLowerCase();
           if (recu.equals("apto")) {
             notaFin = 5;
          }
          System.out.printf("Tu media en Programación es de: %.2f.", notaFin);
        }
      }
    } 
  }
}
