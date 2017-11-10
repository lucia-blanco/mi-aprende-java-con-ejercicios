/**
 * Ejercicio 2
 * 
 * @author Lucia Blanco Salgado
 */
 
 public class Ex03lbs2 { // Clase principal
  public static void main(String[] args) {
    final double GASTOSENVIO = 3.25;
    final double PRECIOCUADRADO = 0.01;
    // Pide datos
    String tieneEscudo = "a";
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura: ");
    int w = Integer.parseInt(System.console().readLine());
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    tieneEscudo = System.console().readLine().toLowerCase();
    // Calcula las cosas
    // Precio por cm cuadrados
    int cuadrados = h*w;
    double precioBanderaCuadrados = (double)cuadrados*PRECIOCUADRADO;
    // Precio por escudo
    double precioEscudo = 0;
    String escudo = "Sin escudo:";
    if (tieneEscudo.equals("s")){
      precioEscudo = 2.50;
      escudo = "Escudo:";
    }
    // Total
    double total = precioBanderaCuadrados + precioEscudo + GASTOSENVIO;
    // Factura
    System.out.println();
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.printf("Bandera de %d %-3s %.2f € \n", cuadrados, "cm²: ", precioBanderaCuadrados);
    System.out.printf("%-20s %.2f € \n", escudo, precioEscudo);
    System.out.printf("%-20s %.2f € \n", "Gastos de envío:", GASTOSENVIO);
    System.out.printf("%-20s %.2f € \n", "Total:", total);
  }
}
