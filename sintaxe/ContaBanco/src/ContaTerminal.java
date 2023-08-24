import java.util.Scanner;

public class ContaTerminal {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    ContaTerminal conta = new ContaTerminal();

    System.out.println("Digite o número da conta:");
    conta.setNumero(scanner.nextInt());

    System.out.println("Digite a agência:");
    conta.setAgencia(scanner.next());

    System.out.println("Digite o nome do cliente:");
    conta.setNomeCliente(scanner.next());

    System.out.println("Digite o saldo:");
    conta.setSaldo(scanner.nextDouble());

    System.out.println(conta);
  }

  int numero;
  String agencia;
  String nomeCliente;
  double saldo;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    if (nomeCliente.length() < 5) {
      System.out.println("Nome inválido");
      return;
    }
    this.nomeCliente = nomeCliente;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    if (saldo < 0) {
      System.out.println("Saldo inválido");
      return;
    }
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    return (
      "Olá " +
      nomeCliente +
      ", obrigado por criar uma conta em nosso banco," +
      " sua agência é " +
      agencia +
      ", conta " +
      numero +
      " e seu saldo " +
      saldo +
      " já está disponível para saque"
    );
  }
}
