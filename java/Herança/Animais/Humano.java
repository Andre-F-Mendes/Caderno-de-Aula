package Animais;
public class Humano extends Animal {
    
    public Humano(String nome){
        super(nome);
    }
    @Override
    public String seComunica(){
        return "Olá, eu sou o " + super.getNome() + "! Tudo bem?";
    }
}
