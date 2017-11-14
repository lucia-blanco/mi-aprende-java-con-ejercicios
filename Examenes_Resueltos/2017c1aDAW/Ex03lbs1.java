/**
 * Ejercicio 1
 * 14/11/2017  |  Turno 1
 * @author Lucia Blanco Salgado
 */
 public class Ex03lbs1 { // Clase principal
  public static void main(String[] args) {
    // Definicion de variables
    String modelo = "a";
    String bateria = "a";
    String cAutom = "a";
    int b1 = 0;
    int b2 = 0;
    double precioModelo;
    double precioBateria;
    double precioCAutom = 0;
    // Preguntas
    System.out.print("Seleccione el modelo de coche (a) Modelo 5 (b) Modelo 8: ");
    modelo = System.console().readLine().toLowerCase();
    // Dependiendo del modelo, ofrece las baterias, añade el precio del model y cambia la respuesta por el numero del modelo
    if (modelo.equals("a")){
      b1 = 50;
      b2 = 70;
      precioModelo = 30000;
      modelo = "5";
    } else {
      b1 = 80;
      b2 = 120;
      precioModelo = 36000;
      modelo = "8";
    }
    System.out.print("Seleccione el tipo de batería (a) " + b1 + " kWh (b) " + b2 + " kWh: ");
    bateria = System.console().readLine().toLowerCase();
    int watios;
    // Mete la bateria elegida en watios para facilitar calculos posteriores
    if (bateria.equals("a")){
      watios = b1;
    } else {
      watios = b2;
    }
    precioBateria = 125*watios;
    // Si el modelo es el 8, pregunta si quiere conduccion autonoma
    if (modelo.equals("8")){
      System.out.print("¿Quiere el paquete de conducción autónoma? (s/n): ");
      cAutom = System.console().readLine().toLowerCase();
      if (cAutom.equals("s")){
        precioCAutom = 1800;
        cAutom = "Con";
      } else {
        cAutom = "Sin";
      }
    }
    // Calcula subvencion y total
    double subvencion = (-1)*(precioModelo + precioBateria + precioCAutom)*0.05;
    double total = precioModelo + precioBateria + precioCAutom + subvencion;
    // Imprime factura
    System.out.println();
    System.out.println("Gracias. Aquí tiene el presupuesto de su coche.");
    System.out.println("Ñesla Modelo " + modelo);
    System.out.printf("%-25s %.2f %s \n", "Precio base", precioModelo, "€");
    System.out.printf("%s %d %-10s %.2f %s \n", "Batería de", watios, "kWh", precioBateria, "€");
    if (modelo.equals("8")){
      System.out.printf("%s %-23s %.2f %s \n", cAutom, "conducción aut.", precioCAutom, "€");
    }
    System.out.printf("%-25s %.2f %s \n", "Subvención estatal", subvencion, "€");
    System.out.printf("%-25s %.2f %s \n", "Total", total, "€");
  }
}
