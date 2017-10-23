/**
 * Ejercicio 24 | Tema 4
 * DCalcula el sueldo neto de un empleado según su cargo, añade dietas y resta IRPF.
 * @author Lucia Blanco
 */
 
 public class Ejercicio24_4 { // Clase principal
  public static void main(String[] args) {
    boolean valido = true;
    System.out.println("1. Programador junior ");
    System.out.println("2. Programador senior ");
    System.out.println("3. Jefe de proyecto \n ");
    System.out.print("Introduza cargo del empleado (1-3): ");
    int cargo = Integer.parseInt(System.console().readLine());
    int sueldoBase = 0;
    switch (cargo){
      case 1:
        sueldoBase = 950;
        break;
      case 2:
        sueldoBase = 1200;
        break;
      case 3:
        sueldoBase = 1600;
        break;
      default:
        valido = false;
        break;
    }
    System.out.print("¿Cuántos días ha estado visitando clientes?: ");
    int diasVisita = Integer.parseInt(System.console().readLine());
    int dietas = diasVisita*30;
    System.out.print("Introduza su estado civil (S (soltero) o C (casado)): ");
    String estadoCivil = System.console().readLine().toLowerCase();
    int irpf = 0;
    switch (estadoCivil){
      case "s":
        irpf = 25;
        break;
      case "c":
        irpf = 20;
        break;
      default:
        valido = false;
        break;
    }
    if (valido == false){
      System.out.print("Alguno de los datos introducidos no es válido");
    } else {
      int sueldoBruto = sueldoBase + dietas;
      double retencion = (double)sueldoBruto*((double)irpf/100);
      double sueldoNeto = (double)sueldoBruto - retencion;
      System.out.printf("%-25s %d \n","Sueldo base: ", sueldoBase);
      System.out.printf("%s%d%-17s %d \n","Dietas (", diasVisita, ") viajes: ", dietas);
      System.out.printf("%-25s %d \n","Sueldo bruto: ", sueldoBruto);
      System.out.printf("%s%d%-7s %.2f \n","Retención IRPF(", irpf, "): ", retencion);
      System.out.printf("%-22s %.2f \n","Sueldo neto: ", sueldoNeto);
    }
  }
}
