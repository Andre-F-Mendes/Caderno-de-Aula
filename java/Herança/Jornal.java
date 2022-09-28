
import java.time.LocalDate;
import java.util.Objects;

public class Jornal extends Produto{
    private final LocalDate data;
    
    public Jornal(String nome, int preco, LocalDate data){
        super(nome, preco);
        Objects.requireNonNull(data, "data não pode ser nula");
        this.data = data;

    }
    @Override
    public String toString(){
        return super.toString() + "\nData: " + this.data;
    }
}
