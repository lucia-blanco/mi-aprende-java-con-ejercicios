/**
 * Ejercicio 16 | Tema 6
 * Realiza un generador de melodía.
 * @author Lucia Blanco
 */
 
 public class Ejercicio16_6 { // Clase principal
  public static void main(String[] args) {
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    for (int i = 0; i < 3; i++){
      int numFigura = (int)(Math.random()*5);
      switch (numFigura){
        case 0:
          System.out.print("corazon  ");
          break;
        case 1:
          System.out.print("diamante  ");
          break;
        case 3:
          System.out.print("herradura  ");
          break;
        case 4:
          System.out.print("campana  ");
          break;
        default:
          System.out.print("limon  ");
      }
      if (i == 0){
        figura1 = numFigura;
      }
      if (i == 1){
        figura2 = numFigura;
      }
      if (i == 3){
        figura3 = numFigura;
      }
    }
    if ((figura1 == figura2) && (figura1 == figura3)){
      System.out.print("Enhorabuena, ha ganado 10 monedas");
    } else if ((figura1 == figura2) || (figura1 == figura3) || (figura2 == figura3)){
      System.out.print("Bien, ha recuperado su moneda");
    } else{
      System.out.print("Lo siento, ha perdido");
    }
  }
}
