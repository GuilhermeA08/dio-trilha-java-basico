public class App {

  public static void main(String[] args) throws Exception {
    IPhone iphone = new IPhone();

    iphone.ipod.tocar();
    iphone.ipod.pausar();
    iphone.ipod.selecionarMusica();

    iphone.navegador.exibirPagina();
    iphone.navegador.adicionarNovaAba();
    iphone.navegador.atualizarPagina();

    iphone.telefone.ligar();
    iphone.telefone.atender();
    iphone.telefone.iniciarCorreioVoz();
  }
}
