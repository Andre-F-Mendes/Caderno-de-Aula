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


}