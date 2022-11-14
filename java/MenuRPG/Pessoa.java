package MenuRPG;

import java.util.Objects;

public abstract class Pessoa {
    private final String nome;
    private final int nivel, idade;
    private double tamanho;

    public Pessoa(String nome, int idade, double tamanho, int nivel){
        
        Objects.requireNonNull(nome);
        this.nome = nome;
        if(nivel <= 0){
            throw new IllegalArgumentException("Nível não pode ser zero ou menor");
        }
        if(idade <= 0){
            throw new IllegalArgumentException("Idade não pode ser zero ou menor");
        }
        this.nivel = nivel; 
        this.idade = idade;
    } 
    public String getNome(){
        return this.nome;
    }
    public int getNivel(){
        return this.nivel;
    } 
    public int getIdade(){
        return this.idade;
    } 
    public double getTamanho(){
        return this.tamanho;
    }
    public abstract String totalCarga();

    

}