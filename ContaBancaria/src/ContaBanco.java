import javax.lang.model.type.DeclaredType;

public class ContaBanco {
  int numero = 1021;
  String agencia = "067-8";
  String nomeDoCliente = "MARIO ANDRADE";
  double saldo = 237.48;
  boolean campoInvalido = false;

  public void acessaNumero(int valoresDigitados) {
    if (valoresDigitados == 0 || valoresDigitados < 1000)
      System.out.println("O numero iserido não é valido, por favor tente novamente");
    else
      numero = valoresDigitados;
  }

  public void acessarAgencia(String valorDaAgenciaDigitado){
   if(valorDaAgenciaDigitado.length()<4){
     System.out.println("Agencia invalida, tente novamente mais tarde");
     campoInvalido = true;
   }
    else 
     agencia = valorDaAgenciaDigitado;
    }

 public void acessaNomeDoCliente(String valorDoNomeInserido) {
    if (valorDoNomeInserido.length() < 2) {
      System.out.println("Nome Invalido, tenre novamente mais tarde");
      campoInvalido = true;
    }
    nomeDoCliente = valorDoNomeInserido;
  }

  public void exibirMensagemFinal() {
    if (campoInvalido == false) 
      System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "
          + agencia + ", conta: " + numero + "+e seu saldo " + saldo + " já está disponível para saque"); 
    else 
      System.out.println("Verifique se os dados estão corretos e tente novamente");
    }

}
