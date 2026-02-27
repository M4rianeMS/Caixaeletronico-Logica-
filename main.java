import java.util.Scanner;

public class main {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Caixaeletronico caixa = new Caixaeletronico();
         caixa.carregarContas("contas.txt");
     

     while(true){
      System.out.printf(" \n--MENU--\n");
      System.out.printf(" ---------------------------------\n");
      System.out.printf(" 1 - Sacar\n 2- Depositar\n 3- Exibir saldo\n 4 - Adicionar conta\n 5 - Sair");
      System.out.printf(" ---------------------------------\n");
      System.out.print("Escolha a operação: ");

      int opcao = sc.nextInt(); 

      if(opcao == 5){
        //caixa.salvarContas("contas.txt");
        System.out.println("Encerrando sistema...");
        break;
      }

      if(opcao == 4){
        System.out.print("Nome do titular: ");
        sc.nextLine(); 
        String nome = sc.nextLine();
        System.out.print("Número da conta: ");
        String numero = sc.next();
        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();
    
        Conta novaConta = new Conta(nome, numero, saldoInicial);
        caixa.adicionarConta(novaConta);
        caixa.salvarContas("contas.txt");
        System.out.println("Conta adicionada à lista!");
        continue;
      }

         System.out.print("Digite o número da conta:");
         String numConta = sc.next();

         Conta contaEncontrada = caixa.pesquisarConta(numConta);

            if(contaEncontrada == null){
                System.out.println("Conta não encontrada. Tente novamente.");
                continue;
            }if(contaEncontrada != null){
                switch(opcao){
                        case 1:
                            System.out.print("Valor do saque: ");
                            double valorSaque = sc.nextDouble();
                            try{
                                caixa.sacar(contaEncontrada, valorSaque);
                            } catch(SaldoInsuficienteException e){
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.print("Valor do depósito: ");
                            double valorDep = sc.nextDouble();
                            caixa.depositar(contaEncontrada, valorDep);
                            break;
                        case 3:
                            System.out.printf("Titular: %s | Saldo: R$%.2f\n", contaEncontrada.getTitular(), contaEncontrada.getSaldo());
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                }
            }
     }
    }
}