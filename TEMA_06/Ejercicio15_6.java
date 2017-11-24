/**
 * Ejercicio 15 | Tema 6
 * Realiza un generador de melodía.
 * @author Lucia Blanco
 */
 
 public class Ejercicio15_6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Melodía:");
    int numCompases = 2;
    do{
    numCompases = (int)((Math.random()*28)+4);
    } while (numCompases%2 != 0);
    //int numNotas = numCompases*4;
    String primera = "";
    for (int i = 0; i < numCompases; i++){
      for (int j = 0; j < 4; j++){
        int numNota = (int)(Math.random()*7);
        String nota = "";
        switch (numNota){
          case 0:
            nota = "do";
            break;
          case 1:
            nota = "re";
            break;
          case 2:
            nota = "mi";
            break;
          case 3:
            nota = "fa";
            break;
          case 4:
            nota = "sol";
            break;
          case 5:
            nota = "la";
            break;
          case 6:
            nota = "si";
            break;
        }
        if ((i == 0) && (j == 0)){
          primera = nota;
        }
        if ((i == numCompases-1) && (j == 3)){
          nota = primera;
        }
      System.out.print(nota + " ");
      }
      System.out.print("|");
    }
    System.out.println("|");
  }
}
