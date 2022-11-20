package MenuRPG;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Pessoa {
    private int forc, des, con, inte, sab, car;
    private final String nomeJogador, nomePersonagem;
    private int idade = 0, nivel = 0;
    private String tamanho;
    private ArrayList talentos = new ArrayList<String>();

    public Pessoa(String nomeJogador, String nomePersonagem, String tamanho, int idade, int nivel){
        this.nomeJogador = Objects.requireNonNull(nomeJogador, "Seu nome não pode ser nulo");
        this.nomePersonagem = Objects.requireNonNull(nomePersonagem, "Nome do personagem não pode ser nulo");
        this.tamanho = Objects.requireNonNull(tamanho, "tamanho não pode ser nulo");
       
        if(idade <= 0){
            throw new IllegalArgumentException("Idade não pode ser menor ou igual a zero");
        }
        if(nivel <= 0){
            throw new IllegalArgumentException("Nível não pode ser menor ou igual a zero");
        }
        this.idade = idade;
        this.nivel = nivel;
    }
    public int getIdade(){
        return this.idade;
    }
    
    public int getNivel() {
        return this.nivel;
    }
    public String getTamanho() {
        return this.tamanho;
    }
    public abstract ArrayList listaTalentos();
}
  