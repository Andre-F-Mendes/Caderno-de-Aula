package java.A2023.DeLorean.src;

public abstract class Motor {
    private double potencia;
    private double quantCombustivel;
    
    public Motor(double potencia, double quantCombustivel) {
        this.potencia = potencia;
        this.quantCombustivel = quantCombustivel;
    }
    
    public double converter(Combustivel c){
        return this.potencia += c.geraEnergia();
    }

    public void abastecer(double quantCombustivel){
        this.quantCombustivel += quantCombustivel;
    }

}
