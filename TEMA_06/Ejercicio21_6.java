/**
 * Ejercicio 21 | Tema 6
 * Genere una secuencia de cinco monedas de curso legal lanzadas al aire.
 * @author Lucia Blanco
 */
 
 public class Ejercicio21_6 { // Clase principal
  public static void main(String[] args) {
    final int numMonedas = 8;
    final int lanzadas = 5;
    String posicion = "";
    String moneda = "";
    for (int i = 0; i < lanzadas; i++){
      int numPos = (int)(Math.random()*2);
      switch (numPos){
        case 0:
          posicion = "cara";
          break;
        default:
          posicion = "cruz";
      }
      int numMon = (int)(Math.random()*7);
      switch (numMon){
        case 0:
          moneda = "1 céntimo";
          break;
        case 1:
          moneda = "2 céntimos";
          break;
        case 2:
          moneda = "5 céntimos";
          break;
        case 3:
          moneda = "10 céntimos";
          break;
        case 4:
          moneda = "20 céntimos";
          break;
        case 5:
          moneda = "50 céntimos";
          break;
        case 6:
          moneda = "1 Euro";
          break;
        default:
          moneda = "2 Euros";
      }
      System.out.println(moneda + " - " + posicion);
    }
  }
}
