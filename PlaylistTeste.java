import java.time.Duration;

public class PlaylistTeste {
    public static void main(String[] args) {
        Duration duracao = Duration.ofSeconds(273);
        Duration duracao1 = Duration.ofSeconds(90);
        
        Playlist playlist1 = new Playlist("Helena");
        //Playlist playlist2 = new Playlist(null);


        Musica musica1 = new Musica("Me lambe", "Raimundos", duracao, 3);
        Musica musica2 = new Musica("Toxicity", "System of Down", duracao1, 2);
        
        System.out.println(playlist1.getTitulo());

        playlist1.addMusica(musica1);

        System.out.println(playlist1.getMusica(0));




    }
}
