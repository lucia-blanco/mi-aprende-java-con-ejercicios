/**
 * Ejercicio 23 | Tema 4
 * Dada una base imponible, IVA y código promocional, calcula el precio total.
 * @author Lucia Blanco
 */
 
 public class Ejercicio23_4 { // Clase principal
  public static void main(String[] args) {
    boolean valido = true;
    System.out.print("Introduzca la base imponible: ");
    double baseImp = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String ivaLet = System.console().readLine().toLowerCase();
    int iva = 0;
    switch (ivaLet){
      case "general":
        iva = 4;
        break;
      case "reducido":
        iva = 10;
        break;
      case "superreducido":
        iva = 21;
        break;
      default:
        valido = false;
        break;
    }
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codProm = System.console().readLine().toLowerCase();
    double ivaPrecio = ((baseImp*iva)/100);
    double ivaTotal = baseImp+ivaPrecio;
    double codPromPrecio = 0;
    switch (codProm){
      case "nopro":
        codPromPrecio = 0;
        break;
      case "mitad":
        codPromPrecio = -ivaTotal/2;
        break;
      case "meno5":
        codPromPrecio = -5;
        break;
      case "5porc":
        codPromPrecio = -(ivaTotal*5)/100;
        break;
      default:
        valido = false;
        break;
    }
    if (valido == true){
      double total = ivaTotal + codPromPrecio;
      System.out.printf("%-25s %.2f \n","Base Imponible: ", baseImp);
      System.out.printf("%s%d%-20s %.2f \n","IVA(", iva, "): ", ivaPrecio);
      System.out.printf("%-25s %.2f \n","Precio con IVA: ", ivaTotal);
      System.out.printf("%s%s%s %.2f \n","Cód. Promocional(", codProm, "): ", codPromPrecio);
      System.out.printf("%-25s %.2f \n","TOTAL: ", total);
    } else {
      System.out.println("Alguno de los datos introducidos no es válido");
    }
  }
}
