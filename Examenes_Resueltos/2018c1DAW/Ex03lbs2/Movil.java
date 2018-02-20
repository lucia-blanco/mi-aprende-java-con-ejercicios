package Ex03lbs2;

/**
 *
 * @author Lucia Blanco
 */
public class Movil extends Terminal{
  String tarifa;
  double dinero;

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
  }

  @Override
  public String toString() {
    return "Nº " + numero + " - " + minutos + "s de conversación - tarificados " + dinero + " euros";
  }
  
  public void llama(Terminal recibe, int min){
    recibe.minutos += min;
    minutos += min;
    double cuesta;
    switch(tarifa){
      case "rata":
        cuesta = 0.06;
        break;
      case "mono":
        cuesta = 0.12;
        break;
      case "bisonte":
        cuesta = 0.3;
        break;
      default:
        cuesta = 0;
    }
    dinero += min*(cuesta/60);
  }
}