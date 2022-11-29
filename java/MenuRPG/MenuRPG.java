package MenuRPG;

import java.util.Objects;
import java.util.Scanner;

public class MenuRPG {

    public static int printaMenu(Equipe equipeA){
        Scanner ent = new Scanner(System.in);
        
        Objects.requireNonNull(equipeA, "Equipe não pode ser nula");
        System.out.println("\nInforme a opção que deseja:\n"+
        "(0) sair\n(1) criar personagem\n(2) remover personagem do grupo\n(3) Mostrar ficha de um personagem\n(4) adicionar itens\n(5) adicionar talentos\n(6) infos da equipe");
               //Só mudando todos para Integer.parseInt(ent.nextLiine()) fez funcionar o código de adicionar
        return Integer.parseInt(ent.nextLine());
    }
    
    public static void main(String[] args) {
        String nomeJogador, nomePersonagem;
        int idade, nivel, tipo;
        double altura;
        
        // Pessoa mago = new Mago("André", "Zapson", "Medio", 86, 20);
        Scanner ent = new Scanner(System.in);
        System.out.print("Informe o nome da playlist: ");
        String nomeEquipe = ent.nextLine();
        Equipe equipe = new Equipe(nomeEquipe);
        System.out.println("Informe o nome do Jogador: ");
        nomeJogador = ent.nextLine();
        while(true){
            int opcao = printaMenu(equipe);
                
            if(opcao == 0){
                System.out.println("Até mais!");
                break;
            }else if(opcao == 1){
                
                System.out.println("Você deseja criar um Mago ou um Guerreiro?\nMago(0) -- Guerreiro(1)");
                tipo = Integer.parseInt(ent.nextLine());
                if(tipo < 0 ||tipo > 1){
                    throw new IllegalArgumentException("Valor invalido");
                }else{
                    System.out.println("Informe o nome do Personagem: ");
                    nomePersonagem = ent.nextLine();
                    System.out.println("Escolha o tamanho do seu personagem: ");
                    altura = ent.nextDouble();
                    System.out.println("Informe a idade do seu Personagem: ");
                    idade = Integer.parseInt(ent.nextLine());
                    System.out.println("Informe o nível do seu Personagem: ");
                    nivel = Integer.parseInt(ent.nextLine());
                }
                if(tipo == 0){
                    Pessoa a = new Mago(nomeJogador, nomePersonagem, altura, idade, nivel);
                    equipe.addPersonagem(a);
                }else if(tipo == 1){
                    Pessoa a = new Guerreiro(nomeJogador, nomePersonagem, altura, idade, nivel);
                    equipe.addPersonagem(a);
                }
            }else if(opcao == 2){
                System.out.println("Informe a posição do personagem que deseja remover: ");
                int pos = Integer.parseInt(ent.nextLine());
                if(pos == 0){
                    throw new IllegalArgumentException("Não existe posição 0");
                    
                }else{
                    System.out.println(equipe.removePersonagem(pos-1)+" (removido)");
                }
            }else if(opcao == 3){
                System.out.println("Personagem especifico(0) ou Todos os personagens(1)");
                int escolha = Integer.parseInt(ent.nextLine());
                if(escolha == 0){
                    System.out.println("Informe a posição do personagem que deseja a ficha:");
                    int pos = Integer.parseInt(ent.nextLine());
                    if(pos == 0){
                        throw new IllegalArgumentException("Não existe posição 0");
                        
                    }else{
                        System.out.println(equipe.getPersonagem(pos-1));
                    }
                }else System.out.println(equipe.getListaPersonagens());
                
            }else if(opcao == 4){
                
            }else if(opcao == 5){
                
            }else if(opcao == 6){
                System.out.println(equipe.toString());
            }
        }
    }
}
