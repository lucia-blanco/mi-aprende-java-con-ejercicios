/**
 * Ejercicio 12 | Tema 3
 * Recibe una primera nota y la nota que se quiere sacar en el trimestre 
 * y calcula 
 * @author Lucia Blanco
 */

public class Ejercicio12_3 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recibe la nota del primer examen */
    System.out.print("Por favor, introduce la nota del primer examen: ");
    linea = System.console().readLine();
    double primeraNota = Double.parseDouble(linea);
    /* Recibe la nota que se quiere sacar en el trimestre */
    System.out.print("Por favor, introduce la nota que quieres sacar en el trimestre: ");
    linea = System.console().readLine();
    double notaTrimestre = Double.parseDouble(linea);
    /* Calcula la nota que necesita para conseguir la media y la muestra*/
    double segundaNota = ((notaTrimestre - (0.4*primeraNota))/0.6);
    System.out.printf("Para tener un %.2f en el trimestre, necesitas sacar un %.2f en el segundo examen", notaTrimestre, segundaNota);
  }
}
