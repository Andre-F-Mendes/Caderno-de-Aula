package MenuRPG;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
       
        
        Equipe equipeA = new Equipe("Maguinhos");
        Pessoa mago = new Mago("André", "Zapson", "Medio", 86, 20);
        Pessoa mago1 = new Mago("André", "Zapson", "Medio", 86, 20);
        Pessoa mago2 = new Mago("André", "Zapson", "pequeno", 86, 20);

        System.out.println(mago.equals(mago1));
        System.out.println(mago.equals(mago2));

        equipeA.addPersonagem(mago);
        equipeA.addPersonagem(mago1);
        equipeA.addPersonagem(mago2);

        Equipe equipeB = new Equipe("Guerreiros");

      

        // System.out.println(equipeA.getPersonagem(0));
        // System.out.println(equipeA.getPersonagem(1));
        // System.out.println(equipeA.getPersonagem(2));
        // System.out.println(equipeA.getListaPersonagens());
        // System.out.println(equipeA.getQuantidadePessoas());
        System.out.println("teste comparação");
        System.out.println();

        
    }
}
