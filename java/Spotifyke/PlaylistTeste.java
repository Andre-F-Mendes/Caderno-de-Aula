
//André
import java.time.Duration;

public class PlaylistTeste {
    public static void main(String[] args) {

        //Duração da muisca me Lambe 
        Duration meLambe = Duration.ofSeconds(196);//Tempo certo
        //Duração da muisca Toxicity
        Duration toxicity = Duration.ofSeconds(225);//Tempo certo
        //Duração da muisca Como Tudo Deve Ser
        Duration comoTudoDeveSer = Duration.ofSeconds(285);//Tempo certo
        //Duração da muisca Pupila
        Duration pupila = Duration.ofSeconds(205);//Tempo certo
        //Duração da muisca Perfect
        Duration perfect = Duration.ofSeconds(259);//Tempo certo

        Playlist playlist = new Playlist("Só as braba");
        //Playlist playlist1 = new Playlist(null);

        Musica musica = new Musica("Me lambe", "Raimundos", meLambe, 3);
        Musica musica1 = new Musica("Toxicity", "System of Down", toxicity, 2);
        Musica musica2 = new Musica("Como Tudo Deve Ser", "Charlie Brown Jr", comoTudoDeveSer, 7);
        Musica musica3 = new Musica("Pupila", "ANAVITÓRIA", pupila, 5);
        Musica musica4 = new Musica("Perfect", "Ed Sheeran", perfect, 90);
        
        System.out.println(playlist.getTitulo());

        playlist.addMusica(musica);
        playlist.addMusica(musica1);
        playlist.addMusica(musica2);
        playlist.addMusica(musica3);
        playlist.addMusica(musica4);

        //Adiciona musica na playlist solicitada
        System.out.println(playlist.getMusica(0));
        System.out.println(playlist.getMusica(1));
        System.out.println(playlist.getMusica(2));
        System.out.println(playlist.getMusica(3));
        System.out.println(playlist.getMusica(4));
        
        System.out.println(playlist.removeMusica(0)+"-removida");
        //Toca a musica da playlist solicitada na posição pedida
        //No caso como foi removida a musica na pos 0, ela é substituida pela proxima
        System.out.println(playlist.tocaMusica(0));
        //Toca uma musica aleatorio da playlist solicitada
        System.out.println(playlist.tocaMusica());

        System.out.println(playlist.getDuracao().toMinutes());

        System.out.println(playlist.toString());
        
        
        
        

    }
}
