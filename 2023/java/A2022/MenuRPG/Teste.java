package MenuRPG;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        var equipeA = new ArrayList<Pessoa>();
        
        
        Equipe equipeB = new Equipe("Guerreiros", equipeA);
        
        Pessoa mago = new Mago("André", "Zapson", "Medio", 86, 20);
        Pessoa mago1 = new Mago("André", "Zapson", "Medio", 86, 20);
        Pessoa mago2 = new Mago("André", "Zapson", "pequeno", 86, 20);
        Pessoa guerreiro = new Guerreiro("André", "Facebookson", "Medio", 60, 20);
        Pessoa guerreiro1 = new Guerreiro("André", "Facebookson", "Medio", 60, 20);
        Pessoa guerreiro2 = new Guerreiro("André", "Facebookson", "Medio", 60, 20);
        equipeB.addPersonagem(mago);
        equipeB.addPersonagem(mago1);
        equipeB.addPersonagem(mago2);
        
        equipeB.addPersonagem(guerreiro);        
        equipeB.addPersonagem(guerreiro1);        
        equipeB.addPersonagem(guerreiro2);
        
        System.out.println(equipeB.getNomePersonagem(0));
        // System.out.println(equipeA.toString());

        

        
    }
}
