package MenuRPG;

import java.util.ArrayList;
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
        String nomeJogador, nomePersonagem, altura;
        int idade, nivel;
        double[] habilidades = new double[6];
        var equipeArray = new ArrayList<Pessoa>();

        // Pessoa mago = new Mago("André", "Zapson", "Medio", 86, 20);
        Scanner ent = new Scanner(System.in);
        System.out.print("Informe o nome da equipe: ");
        String nomeEquipe = ent.nextLine();
        Equipe equipe = new Equipe(nomeEquipe, equipeArray);
        System.out.print("Informe o nome do Jogador: ");
        nomeJogador = ent.nextLine();
        while(true){
            int opcao = printaMenu(equipe);
                
            if(opcao == 0){
                System.out.println("Até mais!");
                break;
            }else if(opcao == 1){
                
                System.out.println("Você deseja criar um Mago ou um Guerreiro?\nMago -- Guerreiro");
                String tipo = ent.nextLine();
                if(tipo.equals("Mago") || tipo.equals("Guerreiro")){
                    System.out.print("Informe o nome do Personagem: ");
                    nomePersonagem = ent.nextLine();
                    System.out.print("Informe a altura do seu Personagem: ");
                    altura = ent.nextLine();
                    System.out.print("Informe a idade do seu Personagem: ");
                    idade = Integer.parseInt(ent.nextLine());
                    System.out.print("Informe o nível do seu Personagem: ");
                    nivel = Integer.parseInt(ent.nextLine());
                    System.out.println("Informe os valores de habilidade do seu personagem(valores devem ter (,0) no final): \nForça, Constituição, Destreza, Inteligência, Sabedoria, Carisma");
                    for(int i = 0; i < habilidades.length; i++){
                        double valor = ent.nextDouble();
                        habilidades[i] = valor;
                    }
                
                    if(tipo.equals("Mago")){
                        equipe.addPersonagem(new Mago(nomeJogador, nomePersonagem, altura, idade, nivel));
                        continue;
                    }else if(tipo.equals("Guerreiro")){
                        equipe.addPersonagem(new Guerreiro(nomeJogador, nomePersonagem, altura, idade, nivel));
                        continue;
                    }
                }else System.out.println("Opção Inválida"); continue;

                
            }else if(opcao == 2){
                System.out.println("Informe a posição do personagem que deseja remover: ");
                int pos = Integer.parseInt(ent.nextLine());
                if(pos == 0){
                    throw new IllegalArgumentException("Não existe posição 0");
                    
                }else{
                    System.out.println(equipe.removePersonagem(pos-1)+" (removido)");
                }
            }else if(opcao == 3){
                if(equipe.getQuantidadePessoas() <= 0){
                    System.out.println("Não há personagens na equipe");
                    continue;
                }else if (equipe.getQuantidadePessoas() == 1){
                    System.err.println(equipe.getListaPersonagens());
                    continue;
                }else System.out.println("Personagem especifico(0) ou Todos os personagens(1)");
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
                if(equipe.getQuantidadePessoas() <= 0){
                    System.out.println("Não há personagens na equipe");
                    continue;
                }
                System.out.print("Qual personagem você deseja adicionar itens:\nNomes: " + equipe.getNomesPersonagens());
                String personagem = ent.nextLine();
                
                for(int i = 0; i < equipe.getQuantidadePessoas(); i++){
                    if(equipe.getNomePersonagem(i).equals(personagem)){
                        System.out.println(equipe.getPersonagem(i).getItensLista());
                        System.out.println("\nInforme a posição do item que deseja adicionar");
                        int pos = Integer.parseInt(ent.nextLine());
                        equipe.getPersonagem(i).addItem(pos, 0);
                    }

                }
                
            }else if(opcao == 5){
                
            }else if(opcao == 6){
                System.out.println(equipe.toString());
            }
        }
    }
}
