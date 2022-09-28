package Spotifyke;
//André
import java.time.Duration;

public class MusicaTesta {
    public static void main(String[] args) {
        Duration duracao1 = Duration.ofSeconds(90);
        Duration duracao = Duration.ofSeconds(273);
        Musica musica1 = new Musica("Roger", "Sub", duracao, 2);
        Musica musica2 = new Musica("Roger", "Sub", duracao1, 2);
        Musica musica3 = new Musica("Como Tudo Deve Ser", "Charlie Brown Jr ", duracao, 3);
        
        
        //true
        System.out.println(musica1.getInterprete().equals("Sub"));
        //true
        System.out.println(musica1.getReproducoes() == 2);
        //false
        System.out.println(musica1.getTitulo().equals(musica2.getTitulo())== false);
        //true
        System.out.println(musica1.getDuration().getSeconds() == 273);
        
        
        musica1.reproduz();
        musica1.reproduz();
        musica1.reproduz();
        
        System.out.println(musica1.getReproducoes() == 5);
        System.out.println(musica3.toString());
    }
}
