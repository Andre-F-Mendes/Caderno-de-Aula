package MenuRPG;


import java.util.ArrayList;
import java.util.Objects;

public class Equipes implements Comparable<Equipes>{
    private final String nomeEquipe;
    private ArrayList<Pessoa> equipe;
    private ArrayList<ArrayList<Pessoa>> contemEquipes = new ArrayList<ArrayList<Pessoa>>();
    
    public Equipes(String nomeEquipe) {

        this.equipe = new ArrayList<>();
        this.contemEquipes.add(equipe);

        Objects.requireNonNull(nomeEquipe, "Nome da equipe não pode ser nulo");
        this.nomeEquipe = nomeEquipe;
    }
    //retorna o nome da Equipe
    public String getNomeEquipe() {
        return this.nomeEquipe;
    }
    //retorna uma equipe
    public ArrayList<Pessoa> getContemEquipes(int pos) {
        return this.contemEquipes.get(pos);
    }
    //retorna quantas equipes já foram criadas
    public int getQuantidadeEquipes() {
        return this.contemEquipes.size();
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
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if(!(obj.getClass().isInstance(this))) return false;
        if(this == obj) return true;
        
        Equipes a = (Equipes)obj;
        return (this.nomeEquipe.equals(a.getNomeEquipe()) && this.getListaPersonagens().equals(a.getListaPersonagens()));
    }
    @Override
    public int compareTo(Equipes o) {
        if(this.equals(o)) return 0;
        int comp = this.nomeEquipe.compareTo(o.getNomeEquipe());
        if(comp == 0){
            if(this.getQuantidadePessoas()<o.getQuantidadePessoas()) return -1;
            else return +1;
        } else return comp;
      
    }

    @Override
    public String toString() {
        String retorno = "\nQuantidade de equipes: " + getQuantidadeEquipes() + "\nNome das Equipes: " + getNomeEquipe();
        return retorno;
    }
    
    
}

