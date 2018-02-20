package Ex03lbs2;

/**
 *
 * @author Lucia Blanco
 */
public class Terminal {
  String numero;
  int minutos;

  public Terminal(String numero) {
    this.numero = numero;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  @Override
  public String toString() {
    return "Nº " + numero + " - " + minutos + "s de conversación";
  }

  public void llama(Terminal telefono, int min){
    telefono.minutos += min;
    minutos += min;
  }
  
}
