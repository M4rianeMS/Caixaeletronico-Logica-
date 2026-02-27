public class Conta {
    private String titular;
    private String numero;
    private double saldo;

    // Construtor
    public Conta(String titular, String numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    //Getters e Setters
    public String getTitular(){
        return this.titular;
    }
    public String getNumero(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
