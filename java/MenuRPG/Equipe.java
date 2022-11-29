package MenuRPG;

import java.util.ArrayList;
import java.util.Objects;

public class Equipe {
    private  String nomeEquipe;
    private ArrayList<Pessoa> equipe;
    
    //constructor
    public Equipe(String nomeEquipe) {
        equipe = new ArrayList<>();
        Objects.requireNonNull(nomeEquipe, "Nome da equipe não pode ser nulo")
        this.nomeEquipe = nomeEquipe;
    }
    //retorna o nome da Equipe
    public String getNomeEquipe() {
        return this.nomeEquipe;
    }
    public int getQuantidadePessoas(){
        return this.equipe.size();
    }
    public Pessoa getPersonagem(int pos){
        return this.equipe.get(pos);
    }
    public String getListaPersonagens(){
        String pessoas = " "; 
        for(int i = 0; i < equipe.size(); i++){
            pessoas += "\n" + equipe.get(i);
        }   
        return pessoas;
    }
    //adiciona um personagem dentro da equipe
    public void addPersonagem(Pessoa personagem){
        Objects.requireNonNull(personagem, "Pessoa não pode ser nulo");
        this.equipe.add(personagem);
    }
    @Override
    public String toString() {
        String retorno = "\nNome da Equipe: " + this.nomeEquipe + "\nQuantidade de Personagens: " + this.getQuantidadePessoas();
        return retorno;
    }
}
