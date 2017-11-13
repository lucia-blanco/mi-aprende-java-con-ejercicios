/**
 * Ejercicio 2
 * 
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs2 { // Clase principal
  public static void main(String[] args) {
    String comida = "a";
    String pitufo = "a";
    String bebida = "a";
    System.out.print("¿Qué ha tomado de comer? palmera, donut o pitufo: ");
    comida = System.console().readLine().toLowerCase();
    if (comida.equals("pitufo")){
      System.out.print("¿Con qué se ha tomado el pitufo? aceite o tortilla: ");
      pitufo = System.console().readLine().toLowerCase();
    }
    System.out.print("¿Qué ha tomado de beber? zumo o cafe: ");
    bebida = System.console().readLine().toLowerCase();
    //Calcula factura
    double precioComida = 0;
    double precioBebida = 0;
    double total;
    switch (comida){
      case "pitufo":
        System.out.print("Pitufo con " + pitufo + ": ");
        if (pitufo.equals("aceite")){
          precioComida = 1.20;
        } else {
          precioComida = 1.80;
        }
        System.out.println(precioComida + "€");
        break;
      case "palmera":
        precioComida = 1.40;
        System.out.println("Palmera: " + precioComida + "€");
        break;
      case "donut":
        precioComida = 1;
        System.out.println("Donut: " + precioComida + "€");
        break;
    }
    switch (bebida){
      case "cafe":
      case "café":
        precioBebida = 1.25;
        System.out.println("Café: " + precioBebida + "€");
        break;
      case "zumo":
        precioBebida = 1.50;
        System.out.println("Zumo: " + precioBebida + "€");
        break;
    }
    total = precioComida + precioBebida;
    System.out.println("Total: " + total + "€");
  }
}
