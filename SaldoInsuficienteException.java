public class SaldoInsuficienteException extends Exception{
    
    public SaldoInsuficienteException(double saldo, double valorDesejado) {
        super("Erro: Saldo insuficiente. Saldo atual: R$" + saldo + 
              " | Valor solicitado: R$" + valorDesejado);
    }
}
