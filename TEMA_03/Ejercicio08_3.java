/**
 * Ejercicio 8 | Tema 3
 * Calcula el salario semanal de un empleado en base a las horas trabajadas.
 * @author Lucia Blanco
 */

public class Ejercicio08_3 { // Clase principal
  public static void main(String[] args) {
    String linea;
    int eurosHora = 12;
    /* Recibe horas trabajadas */
    System.out.print("Por favor, introduce las horas trabajadas: ");
    linea = System.console().readLine();
    int horasTrabajadas = Integer.parseInt(linea);
    /* Calcula el salario y lo muestra */
    int totalSueldo = (eurosHora*horasTrabajadas);
    System.out.printf("El sueldo correspondiente a %d horas de trabajo, son %d euros", horasTrabajadas, totalSueldo);
  }
}
