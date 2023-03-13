package Animais;
public class Cachorro extends Animal {
    
    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public String seComunica(){
        return "au au";
    }
}
