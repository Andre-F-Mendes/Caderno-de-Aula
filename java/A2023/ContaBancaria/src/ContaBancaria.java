
/**
 * Write a description of class ContaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContaBancaria
{
    private double saldo;
    private final int agencia;
    private final int numero;

    /**
     * Constructor for objects of class Conta
     */
    public ContaBancaria(int agencia, int numero)
    {
        this.agencia = agencia;
        this.numero = numero;
    }
    
    // Exemplo de sobrecarga de construtor - polimorfismo do tipo overloading
    public ContaBancaria(int agencia, int numero, double valor)
    {
        this (agencia, numero);
        creditar(valor);
    }

    public void creditar(double valor)
    {
        saldo += valor;
    }
    
    public void debitar(double valor)
    {
        saldo -= valor;
    }
   
    
     public void transferir(ContaBancaria conta, double valor)
    {
        this.debitar(valor);
        conta.creditar(valor);
    }
    
    public String toString(){
        return("Agencia = " + agencia +
                            "\nNumero = " + numero +
                            "\nSaldo = " + saldo);
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
    
    //Override do equals herdado de Object
    public boolean equals(Object obj){
        if (obj instanceof ContaBancaria){
            ContaBancaria conta = (ContaBancaria) obj;
            if ((this.agencia == conta.agencia) &&
               (this.numero == conta.numero) ){
                   return true;
                }
        }
        return false;
    }
    
}
