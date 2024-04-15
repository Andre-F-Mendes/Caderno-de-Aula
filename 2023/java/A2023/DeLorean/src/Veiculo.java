package java.A2023.DeLorean.src;

public class Veiculo {
    private final int ano;
    private final String modelo, placa;
    private Motor motor;
    private boolean ligado = false;
    private int velocidade = 0;

    public Veiculo(int ano, String modelo, String placa) {
        this.ano = ano;
        this.modelo = modelo;
        this.placa = placa;
    }
}
