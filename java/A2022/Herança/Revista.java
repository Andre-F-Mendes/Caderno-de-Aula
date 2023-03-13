
import java.util.Objects;

public class Revista extends Produto{
    private final String genero;

    public Revista(String nome, int preco, String genero){
        super(nome, preco);
        Objects.requireNonNull(genero, "genero não pode ser nulo");
        this.genero = genero;
    }
    @Override
    public String toString(){
        return super.toString() + "\nGenero: " + this.genero;
    }
}