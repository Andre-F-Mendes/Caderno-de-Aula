import java.util.Scanner;
public class AppCarro {
    //seria a mesma coisa que Scanner ent só que Carro criaCarro em metodo  
    public static Carro criaCarro(){
        Scanner ent = new Scanner(System.in);
        System.out.print("\nInforme o nome do Carro: ");
        //retorna um novo objeto Carro com a entrada do nome informada
        return new Carro(ent.nextLine());
        
    }
    public static int printaMenu(){
        Scanner ent = new Scanner(System.in);
        System.out.println("\nInforme a opção que deseja:\n"+
        "(0) sair\n(1) imprimir status do carro\n(2) aumentar marcha\n(3) diminuir marcha\n(4) frear carro\n(5) acelerar carro\n(6) ligar o carro\n(7) desligar o carro");
        return ent.nextInt();

    }
    public static void menuPrintaInfo(Carro carroA){
        String Estado;
        if(carroA.isLigado())Estado = "ligado";
        else Estado = "desligado";
        System.out.println("\nCarro: " + carroA.getnome() +
        "\nEstado: " + Estado +
        "\nVelocidade: " + carroA.getvelocidade() + "K/h" +
        "\nMarcha: " + carroA.getmarcha());
    }
    public static void menuFreia(Carro carroA){
        Scanner ent = new Scanner(System.in);
        System.out.print("\nInforme o quanto deseja freiar: ");
        carroA.freia(ent.nextDouble());
    }
    public static void menuAcelera(Carro carroA){
        Scanner ent = new Scanner(System.in);
        System.out.println("\nInforme o quanto deseja acelerar: ");
        carroA.acelera(ent.nextInt());
    }   
    public static void main(String[] args) {
        int opcao;
        
        Carro carroA = criaCarro();

        while(true){
            opcao = printaMenu();
             
            if(opcao == 0){
                System.out.println("Até mais!");
                break;
            }else if(opcao == 1){
                menuPrintaInfo(carroA);
            }else if(opcao == 2){
                //(2) aumentar marcha;
                carroA.upMarcha();
            }else if(opcao == 3){
                //(3) diminuir marcha;
                carroA.downMarcha();
            }else if(opcao == 4){
                menuFreia(carroA);
            }else if(opcao == 5){
                menuAcelera(carroA);
            }else if(opcao == 6){
                //(6) ligar o carro;
                if(carroA.getmarcha() == 0){
                    carroA.liga();
                }else System.out.println("\nA marcha precisa estar neutra(0). ");
            }else if(opcao == 7){
                //(7) desligar o carro.
                carroA.desliga();
            }   

            
        }
        
    }   
     
}