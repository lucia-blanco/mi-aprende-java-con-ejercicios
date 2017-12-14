/**
 * Ejercicio 3
 * 14/12/2017  |  Turno 1
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs3 { // Clase principal
  public static void main(String[] args) {
    //Crea el array y se meten los 6 alumnos del ejemplo
    String[] alumnos = new String[6];
    alumnos[0] = "Adrián Aguilar";
    alumnos[1] = "Manuel Alcántara";
    alumnos[2] = "Jorge Alcaraz";
    alumnos[3] = "Joaquín Bello";
    alumnos[4] = "María Margarita Benítez";
    alumnos[5] = "Francisco Casasola";
    // Se elige uno aleatoriamente y se imprime
    System.out.print("Le ha tocado salir a... ");
    int alumnoAleatorio = (int)((Math.random()*6));
    System.out.print(alumnos[alumnoAleatorio]);
  }
} 
