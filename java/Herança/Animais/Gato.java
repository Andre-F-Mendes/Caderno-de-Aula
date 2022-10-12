package Animais;
public class Gato extends Animal{
    
    public Gato(String nome){
        super(nome);
    }
    @Override
    public String seComunica(){
        return "maiu";
    }
}
