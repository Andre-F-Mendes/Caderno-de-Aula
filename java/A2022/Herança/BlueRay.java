
import java.time.Duration;
import java.util.Objects;

public class BlueRay extends Produto{
    private final Duration duracao;

    public BlueRay(String nome, int preco, Duration duracao){
        super(nome, preco);
        Objects.requireNonNull(duracao, "duracao não pode ser nula");

        this.duracao = duracao;
    }
    @Override
    public String toString(){
        String intText = String.format(" (%d:%02d)", this.duracao.toMinutesPart(), this.duracao.toSecondsPart());
        
        return super.toString() + "\nDuração:" + intText;
    }
}