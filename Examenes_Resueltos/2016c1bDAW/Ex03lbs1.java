/**
 * Ejercicio 1
 * 
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs1 { // Clase principal
  public static void main(String[] args) {
    String sabor = "a";
    String choco = "";
    String nata = "a";
    String nombre = "a";
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    sabor = System.console().readLine().toLowerCase();
    if (sabor.equals("chocolate")){
      System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
      choco = System.console().readLine().toLowerCase();
    }
    System.out.print("¿Quiere nata? (si o no): ");
    nata = System.console().readLine().toLowerCase();
    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    nombre = System.console().readLine().toLowerCase();
    //Calcula factura
    int precioSabor = 0;
    double precioNata = 0;
    double precioNombre = 0;
    double total;
    System.out.print("Tarta de " + sabor);
    switch (sabor){
      case "chocolate":
        if (choco.equals("negro")){
          precioSabor = 14;
          System.out.print(" negro");
        } else {
          precioSabor = 15;
          System.out.print(" blanco");
        }
        break;
      case "manzana":
        precioSabor = 18;
        break;
      case "fresa":
        precioSabor = 16;
        break;
    }
    System.out.println(": " + precioSabor + "€");
    if (nata.equals("no")){
      System.out.println("Sin nata: " + precioNata + "€");
    } else {
      precioNata = 2.5;
      System.out.println("Con nata: " + precioNata + "€");
    }
    if (nombre.equals("no")){
      System.out.println("Sin nombre: " + precioNombre + "€");
    } else {
      precioNombre = 2.75;
      System.out.println("Con nombre: " + precioNombre + "€");
    }
    total = (double)(precioSabor) + precioNata + precioNombre;
    System.out.println("Total: " + total + "€");
  }
}
