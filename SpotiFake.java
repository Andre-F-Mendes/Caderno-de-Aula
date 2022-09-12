package Spotifyke;


import java.time.Duration;
import java.util.Objects;
import java.util.Scanner;

public class SpotiFake {
    

    public static int printaMenu(Playlist playlistA){
        Scanner ent = new Scanner(System.in);
        
        Objects.requireNonNull(playlistA, "Playlist não pode ser nula");
        System.out.println("\nInforme a opção que deseja:\n"+
        "(0) sair\n(1) adiciona musica\n(2) remover musica\n(3) busca musica\n(4) toca musica\n(5) toca musica random\n(6) duracao playlist\n(7) infos playlist");
        
        return ent.nextInt();
    }

    public static void main(String[] args) {
        String titulo;
        String interprete;
        Duration duracao;
        Duration duracao1;
        
        Scanner ent = new Scanner(System.in);
        System.out.print("Informe o nome da playlist: ");
        String nome = ent.nextLine();
        Playlist novaPlaylist = new Playlist(nome);

        while(true){
            int opcao = printaMenu(novaPlaylist);
            
            //encerra o while com um break
            if(opcao == 0){
                System.out.println("Até mais!");
                break;
            }
            //Pede as informações, cria a musica com as informações e adicionnna a música na playlist
            else if(opcao == 1){
                
                System.out.print("Informe o interpréte da música: ");
                interprete = ent.nextLine();
                System.out.print("Informe o nome da música: ");
                titulo = ent.nextLine();
                System.out.print("Informe os minutos da música: ");
                duracao = Duration.ofMinutes(ent.nextInt());
                System.out.print("Informe os segundos da música: ");
                duracao1 = Duration.ofSeconds(ent.nextInt());
                Duration minutosSegundos = duracao.plus(duracao1);
                
                novaPlaylist.addMusica(new Musica(titulo, interprete, minutosSegundos, 0));
            }
            //solicita e remove a musica da playlist
            else if(opcao == 2){
                // solicita a posição para remover uma música.
                System.out.print("Informe a posição da música que quer remover: ");
                int pos = ent.nextInt();
                System.out.println(novaPlaylist.removeMusica(pos)+" (removida)");
            }
            //busca a musica na posição solicitada e imprime os dados da música
            else if(opcao == 3){
                System.out.print("Informe a posição da música: ");
                int pos = ent.nextInt();
                System.out.println(novaPlaylist.tocaMusica(pos-1).toString());
            }
            //toca musica na posição pedida
            else if(opcao == 4){
                System.out.println("Informe a posição da música que deseja tocar: ");
                int pos = ent.nextInt();
                novaPlaylist.tocaMusica(pos-1);
            }
            //toca música aleatoria
            else if(opcao == 5){
                System.out.println(novaPlaylist.tocaMusica());
            }
            //imprime a duração da playlist no formato hh:mm:ss
            else if(opcao == 6){
                System.out.println(novaPlaylist.getDuracao());
            }
            //imprime as informações da playlist
            else if(opcao == 7){
                System.out.println(novaPlaylist.toString());
            }
                
           
        }
    }
}
