/**
 * Ejercicio 4 | Tema 7
 * Array numero = valores aleatorios entre 0 y 100.
 * Array cuadrado = cuadrados de los valores que hay en el array numero. 
 * Array cubo = los cubos de los valores que hay en numero.
 * @author Lucia Blanco
 */
 
 public class Ejercicio04_7 { // Clase principal
  public static void main(String[] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    for (int i = 0; i < 20; i++){
      numero[i] = (int)(Math.random()*100);
    }
    for (int i = 0; i < 20; i++){
      cuadrado[i] = numero[i]*numero[i];
    }
    for (int i = 0; i < 20; i++){
      cubo[i] = cuadrado[i]*numero[i];
    }
    System.out.println();
    System.out.print("Número: ");
    for (int i = 0; i < 20; i++){
      System.out.print(numero[i]+" ");
    }
    System.out.println();
    System.out.print("Cuadrado: ");
    for (int i = 0; i < 20; i++){
      System.out.print(cuadrado[i]+" ");
    }
    System.out.println();
    System.out.print("Cubo: ");
    for (int i = 0; i < 20; i++){
      System.out.print(cubo[i]+" ");
    }
  }
}
