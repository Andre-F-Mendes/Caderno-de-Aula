//Nome: André Mendes Pinto
import java.util.Scanner;
public class AppConsultorio {

    public static Paciente cadastraPaciente(){
        //nome
        Scanner ent = new Scanner(System.in);
        System.out.print("\nInforme o nome do Paciente: ");
        String nome = ent.nextLine();
        
        int tamanho = nome.length();
        
        int valorAscii;
        boolean nomeInvalido = true;

        while(nomeInvalido){
            int quantia = 0;
            for(int i = 0; i < nome.length(); i++){
                valorAscii = (int)nome.charAt(i);
                if((valorAscii == 32) || (valorAscii >= 65 && valorAscii <= 90) 
                || (valorAscii >= 97 && valorAscii <= 122) || (valorAscii >= 192 && valorAscii <= 214) 
                || (valorAscii >= 216 && valorAscii <= 246) || (valorAscii >= 248 && valorAscii <= 255)){
                    quantia++;
                }
            }
            if(quantia != tamanho || tamanho <= 0){
                System.out.print("\nNome inválido, informe um nome válido para o Paciente: ");
                nome = ent.nextLine();
                tamanho = nome.length();  
            }else nomeInvalido = false;
        }
        
        //sexo
        System.out.print("\nInforme o sexo do Paciente: ");
        char sexo = ent.next().charAt(0);
        while(sexo != 'M' && sexo != 'F'){
            System.out.print("\nSexo inválido, informe um sexo válido para o Paciente: ");
            sexo = ent.next().charAt(0);
        }
        //peso
        System.out.print("\nInforme o peso do Paciente: ");
        double peso = ent.nextDouble();
        while(peso < 0){
            System.out.print("\nPeso inválido, informe um peso válido para o Paciente: ");
            peso = ent.nextDouble();
        }
        //peso
        System.out.print("\nInforme a idade do Paciente: ");
        int idade = ent.nextInt();
        while(idade < 0){
            System.out.print("\nIdade inválida, informe uma idade válida para o Paciente: ");
            idade = ent.nextInt();
        }
        //altura
        System.out.print("\nInforme a altura do Paciente(em cm): ");
        double altura = ent.nextDouble();
        while(altura < 0){
            System.out.print("\nAltura inválida, informe uma altura válida para o Paciente: ");
            altura = ent.nextDouble();
        }
        return new Paciente(nome, sexo, altura, peso, idade);
    }
    public static int printaMenu(Paciente pacienteA){
        Scanner ent = new Scanner(System.in);
        if(pacienteA != null){
            System.out.println("\nInforme a opção que deseja:\n"+
        "(0) sair\n(1) cadastra paciente\n(2) emagrecer\n(3) engordar\n(4) valor IMC\n(5) valor Percentual de Gordura\n(6) infos paciente\n");
        }else System.out.println("\nInforme a opção que deseja:\n"+
        "(0) sair\n(1) cadastra paciente\n");
        
        return ent.nextInt();

    }
    public static void menuEmagrece(Paciente pacienteA){
        Scanner ent = new Scanner(System.in);
        System.out.print("\nInforme o quanto deseja emagrecer: ");
        pacienteA.emagrece(ent.nextDouble());
    }
    public static void menuEngorda(Paciente pacienteA){
        Scanner ent = new Scanner(System.in);
        System.out.print("\nInforme o quanto deseja engordar: ");
        pacienteA.engorda(ent.nextDouble());
    }
    public static void main(String[] args) {
        int opcao;
        Paciente pacienteA = null;

        while(true){
            opcao = printaMenu(pacienteA);

            if(opcao == 0){
                System.out.println("Até mais!");
                break;
            }else if(opcao == 1){
                pacienteA = cadastraPaciente();
            }else if(pacienteA != null){
                if(opcao == 2){
                    menuEmagrece(pacienteA);
                }else if(opcao == 3){
                    menuEngorda(pacienteA);
                }else if(opcao == 4){
                    System.out.println(pacienteA.getImc());
                }else if(opcao == 5){
                    System.out.println(pacienteA.getPercentualGordura());
                }else if(opcao == 6){
                    System.out.println(pacienteA.paraString());
                }
            }
        }
    }
}
