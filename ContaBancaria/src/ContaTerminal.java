import java.util.Scanner;// TODO: Conhecer e importar a classe Scanner
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        String agencia ;
        String nome ;
        int numero ;
        Scanner entrada = new Scanner(System.in);//objeto de entrada
        ContaBanco conta = new ContaBanco();
        System.out.println("Por favor, digite o número da conta sem o digito!"); //ola mundo// Exibir mensagem para nosso usuario
                                   // Obter pelo scanner os valores digitados no terminal
            numero = entrada.nextInt();//entrada de dado via teclado 
    
           System.out.println("Por favor, digite o número da Agência !"); //ola mundo// Exibir mensagem para nosso usuario
            agencia = entrada.nextLine();
           agencia = entrada.nextLine();
           
           System.out.println("Por favor, digite o seu Nome !"); //ola mundo// Exibir mensagem para nosso usuario
           nome = entrada.nextLine();
         
         conta.acessaNumero(numero);
         conta.acessarAgencia(agencia);
         conta.acessaNomeDoCliente(nome);
    
        // exibir a mensagem da conta criada
        conta.exibirMensagemFinal();
    }

  }
  