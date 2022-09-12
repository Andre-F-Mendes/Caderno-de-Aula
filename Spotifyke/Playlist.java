package Spotifyke;
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
        return this.listaMusicas.get(pos).getTitulo();
    }
    //return musica aleatoria
    public String tocaMusica(){
        //cria int com valor aleatorio de 0 a 1 multiplicado pelo tamanho da playlist
        //porem o valor é transformado em int
        int numeroAletatorio = (int)(Math.random() * listaMusicas.size());

        return this.listaMusicas.get(numeroAletatorio).getTitulo();
    }
    public Duration getDuracao(){
        Duration soma = Duration.ofSeconds(0);
        for(int i= 0; i <listaMusicas.size();i++){
            soma = listaMusicas.get(i).getDuration().plus(soma);
        }
        return soma;
    }

    @Override
    public String toString(){
       if(this.listaMusicas.size() == 0){
        String retorno = "\nPlaylist |" + this.titulo + "|\n" + this.listaMusicas.size() + " música" + ", tempo: " + 
        String.format(" %dmin%02ds", this.getDuracao().toMinutesPart(), this.getDuracao().toSecondsPart());
        for(int i = 0; i < this.listaMusicas.size(); i++){
            retorno += "\n" + (i+1) + "- " + this.listaMusicas.get(i);
        }

        return retorno;
       }else{
        String retorno = "\nPlaylist |" + this.titulo + "|\n" + this.listaMusicas.size() + " músicas" + ", tempo: " + 
        String.format(" %dmin%02ds", this.getDuracao().toMinutesPart(), this.getDuracao().toSecondsPart()) + "\n_-Músicas na playlist-_";
        for(int i = 0; i < this.listaMusicas.size(); i++){
            retorno += "\n" + (i+1) + "- " + this.listaMusicas.get(i);

        }

        return retorno;
       }
        
    }
}