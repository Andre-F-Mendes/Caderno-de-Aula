package Animais;
import java.util.ArrayList;

public class TestaAnimais {
    public static void main(String[] args) {
        var animais = new ArrayList<Animal>();
        
        Animal cachorro = new Cachorro("Lilica");
        Animal cachorro1 = new Cachorro("Doris");
        Animal gato1 = new Gato("Café");
        Animal pato1 = new Pato("Kovisk");
        Animal humano = new Humano("André");
        Animal humano1 = new Humano("Lune");
        //Animal gato2 = new Gato(null);
        //Animal cachorro2 = new Cachorro(null);
        //Animal pato2 = new Pato(null);
        //Animal humano2 = new Humano(null);
        
        animais.add(cachorro);
        animais.add(cachorro1);
        animais.add(gato1);
        animais.add(pato1);
        animais.add(humano);
        animais.add(humano1);
        

        for(Animal animais1 : animais){
            if(animais1 instanceof Humano){
                break;
            }else{
                System.out.println(animais1.getNome() + " - " + animais1.seComunica());
            } 
        }


    }
}
