import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Caixaeletronico {
    private List<Conta> contas = new ArrayList<>();
    
    public void sacar(Conta conta, double valor) throws SaldoInsuficienteException{
        if(conta.getSaldo() >= valor){
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.printf("Saque de R$%.2f realizado com sucesso!", valor);
        } else throw new SaldoInsuficienteException(conta.getSaldo(), valor);
    }

    public void depositar(Conta conta, double valor){
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.printf("Depósito de R$%.2f realizado com sucesso!", valor);
    }

    public Conta pesquisarConta(String numero){
        for(Conta conta : contas){
            if(conta.getNumero().equals(numero)){
                return conta;
            }
        }
        return null;
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public void carregarContas(String caminho){
        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String linha;
            while((linha = br.readLine()) != null){
                String[] dados = linha.split(";");
                String titular = dados[0];
                String numero = dados[1];
                double saldo = Double.parseDouble(dados[2]);
                adicionarConta(new Conta(titular, numero, saldo));
    }
        } catch(IOException e){
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }

    public void salvarContas(String caminho){
        try(PrintWriter pw = new PrintWriter(new FileWriter(caminho))){
            for(Conta conta : contas){
               pw.println(conta.getTitular() + ";" + conta.getNumero() + ";" + conta.getSaldo());
            }
            System.out.println("Alterações salvas com sucesso no arquivo!");
        }
        catch(IOException e){
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}


