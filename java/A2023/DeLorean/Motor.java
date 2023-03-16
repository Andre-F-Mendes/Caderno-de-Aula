package java.A2023.DeLorean;

public abstract class Motor {
    
    double potencia;
    int kilometragem;  
    double quantCombustivel;

    abstract double converter(Combustivel c);
    abstract void abastecer(double quantCombustivel);

}