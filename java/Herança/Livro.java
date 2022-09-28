package Herança;

import java.util.Objects;

public class Livro extends Produto{
    //nome, autorPrincipal, editora, preço
    private final String autorPrincipal;
    private String editora;

    public Livro(String nome, int preco, String autorPrincipal, String editora){
        super(nome, preco);
        Objects.requireNonNull(autorPrincipal, "autorPrincipal não pode ser nulo");
        Objects.requireNonNull(editora, "editora não pode ser nulo");
        this.autorPrincipal = autorPrincipal;
        this.editora = editora;
    }
    @Override
    public String toString(){
        return super.toString() + "\nAutor: " + this.autorPrincipal + "\nEditora: " + this.editora;
    }
}