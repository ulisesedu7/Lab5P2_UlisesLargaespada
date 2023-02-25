public class Personaje {
  private String name;
  private double poder;
  private String debilidad;
  private String universo;
  private double fuerza;
  private double agilidadFisica;
  private double agilidadMental;
  private double puntosVida;

  public Personaje() {
  }

  public Personaje(String name, double poder, String debilidad, String universo, double fuerza, double agilidadFisica, double agilidadMental, double puntosVida) {
    this.name = name;
    this.poder = poder;
    this.debilidad = debilidad;
    this.universo = universo;
    this.fuerza = fuerza;
    this.agilidadFisica = agilidadFisica;
    this.agilidadMental = agilidadMental;
    this.puntosVida = puntosVida;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPoder() {
    return poder;
  }

  public void setPoder(double poder) {
    this.poder = poder;
  }

  public String getDebilidad() {
    return debilidad;
  }

  public void setDebilidad(String debilidad) {
    this.debilidad = debilidad;
  }

  public String getUniverso() {
    return universo;
  }

  public void setUniverso(String universo) {
    this.universo = universo;
  }

  public double getFuerza() {
    return fuerza;
  }

  public void setFuerza(double fuerza) {
    this.fuerza = fuerza;
  }

  public double getAgilidadFisica() {
    return agilidadFisica;
  }

  public void setAgilidadFisica(double agilidadFisica) {
    this.agilidadFisica = agilidadFisica;
  }

  public double getAgilidadMental() {
    return agilidadMental;
  }

  public void setAgilidadMental(double agilidadMental) {
    this.agilidadMental = agilidadMental;
  }

  public double getPuntosVida() {
    return puntosVida;
  }

  public void setPuntosVida(double puntosVida) {
    this.puntosVida = puntosVida;
  }

  @Override
  public String toString() {
    return name;
  }
  
}
