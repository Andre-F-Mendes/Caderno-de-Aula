package MenuRPG;

import java.util.ArrayList;
import java.util.Objects;

public class Equipe{
    private String nomeEquipe;
    private ArrayList<Pessoa> equipe;
    
    //constructor
    public Equipe(String nomeEquipe) {
        equipe = new ArrayList<>();
        Objects.requireNonNull(nomeEquipe, "Nome da equipe não pode ser nulo");
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
    
    public String getNomesPersonagens(){
        String nomes = " ";
        for(int i = 0; i < this.getQuantidadePessoas(); i++){
            nomes += " "+ this.equipe.get(i).getNomePersonagem();
        }
        return nomes;
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
    public Pessoa removePersonagem(int pos){
        Pessoa personagemRemovido = this.equipe.get(pos);
        this.equipe.remove(pos);
        return personagemRemovido;
    }
    //toString de equipe
    @Override
    public String toString() {
        String retorno = "\nNome da Equipe: " + this.nomeEquipe + "\nQuantidade de Personagens: " + this.getQuantidadePessoas();
        if(getQuantidadePessoas() >= 1){
            retorno +=  "\nPersonagens: " + getNomesPersonagens();
        }
        return retorno;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if(!(obj.getClass().isInstance(this))) return false;
        if(this == obj) return true;

        Equipes a = (Equipes)obj;
        return (this.nomeEquipe.equals(a.getNomeEquipe()) && this.getListaPersonagens().equals(a.getListaPersonagens()));
    }
    
}
