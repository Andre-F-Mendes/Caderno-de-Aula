package Animais;
public class Pato extends Animal {
    
    public Pato(String nome){
        super(nome);
    }

    @Override
    public String seComunica(){
        return "quack quack";
    }
}
