//André
import java.time.Duration;
import java.util.Objects;

public class Musica{
    private final String titulo;
    private final String interprete;
    private final Duration duracao;
    private int numeroReproducao;

    public Musica(String titulo, String interprete, Duration duracao, int reproducoes){
        
        //valida titulo
        Objects.requireNonNull(titulo, "O título não pode ser nulo");

        //valida interprete
        Objects.requireNonNull(interprete, "O interprete não pode ser nulo");

        //valida duração
        Objects.requireNonNull(duracao, "A duração não pode ser nula");
        
        //valida reprodução
        Objects.requireNonNull(reproducoes, "As reproduções não podem ser nulas");

        

        if(duracao.isNegative()){
            throw new IllegalArgumentException("Duração não pode ter valor negativo");
        }if(reproducoes < 0){
            throw new IllegalArgumentException("O valor de reproduções não pode ser negativo");
        }

        this.titulo = titulo;
        this.interprete = interprete;
        this.duracao =  duracao;
        this.numeroReproducao = reproducoes;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getInterprete(){
        return this.interprete;
    }
    public Duration getDuration(){
        return this.duracao;
    }
    public int getReproducoes(){
        return this.numeroReproducao;
    }
    public void reproduz(){
        this.numeroReproducao++;
    }
    
    @Override
    public String toString(){
        String intText = String.format(" (%d:%02d)", this.duracao.toMinutesPart(), this.duracao.toSecondsPart());

        return "Música: " + this.titulo + intText + " - " + this.interprete + " [" + this.numeroReproducao + " tocadas]";
    }
}