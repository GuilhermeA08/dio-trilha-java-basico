public class IPhone {

  public IPod ipod;
  public Navegador navegador;
  public Telefone telefone;

  public IPhone() {
    this.ipod = new IPod();
    this.navegador = new Navegador();
    this.telefone = new Telefone();
  }
}
