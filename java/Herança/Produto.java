package Herança;

import java.util.Objects;

public class Produto {
    private final String nome;
    private int preco;

    public Produto(String nome, int preco){
        Objects.requireNonNull(nome, "nome não pode ser nulo");
        if(preco < 0){
            throw new IllegalArgumentException("preco não pode ser menor que zero");
        }
        this.nome = nome;
        this.preco = preco;
    }
}
