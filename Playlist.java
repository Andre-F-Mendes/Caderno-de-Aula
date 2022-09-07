import java.time.Duration;
import java.util.ArrayList;
import java.util.Objects;

public class Playlist{
    private final String titulo;
    private ArrayList<Musica> listaMusicas;

    public Playlist(String titulo){
        this.listaMusicas = new ArrayList<>();

        Objects.requireNonNull(titulo, "Titulo não pode ser nulo");
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void addMusica(Musica musica){
        Objects.requireNonNull(musica);
        this.listaMusicas.add(musica);
        
    }
    public Musica getMusica(int pos){
        return this.listaMusicas.get(pos);
    }
    public Musica removeMusica(int pos){
        Musica musicaRemovida = this.listaMusicas.get(pos);
        this.listaMusicas.remove(pos);
        return musicaRemovida;
    }
    public String tocaMusica(int pos){
        this.listaMusicas.get(pos).reproduz();
        return listaMusicas.get(pos).getTitulo();
    }
    public Duration getDuracao(){
        int soma = 0;
        for(int i = 0; i < this.listaMusicas.size(); i++){
            soma += this.listaMusicas.get(i).getDuration().toSecondsPart();
        }
        return Duration.ofSeconds(soma);
    }


}