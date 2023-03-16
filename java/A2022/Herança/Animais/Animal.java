package Animais;
import java.util.Objects;

public abstract class Animal {
    private final String nome;

    public Animal(String nome){
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public abstract String seComunica();
}
