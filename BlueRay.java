package Herança;

import java.time.Duration;
import java.util.Objects;

public class BlueRay extends Produto{
    private final Duration duracao;

    public BlueRay(String nome, int preco, Duration duracao){
        super(nome, preco);
        Objects.requireNonNull(duracao);

        this.duracao = duracao;
    }
    


}