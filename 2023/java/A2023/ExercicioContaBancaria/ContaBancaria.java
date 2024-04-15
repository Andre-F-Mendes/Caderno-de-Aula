package java.A2023.ExercicioContaBancaria;

public class ContaBancaria {
    
    private final int agencia;
    private int numero;
    private double saldo;
    
    public ContaBancaria(int agencia, int numero, double saldo) {
        if(agencia < 0){
            throw new IllegalArgumentException("Agência não pode ser negativa");
        }
        if(numero < 0){
            throw new IllegalArgumentException("Número da conta não pode ser negativo");
        }
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        
    }
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valorDeposito){
        if(valorDeposito <= 0){
            throw new IllegalArgumentException("Valor de deposito inválido.");
        }else this.saldo =+ valorDeposito;
        
    }
    public void sacar(double valorSaque){
        if(valorSaque <= 0){
            throw new IllegalArgumentException("Valor de saque inválido.");
        }else this.saldo =+ valorSaque;
    }
    public void transferir (ContaBancaria conta, double valor){
        
    }


}
