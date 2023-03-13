package MenuRPG;


import java.util.ArrayList;


public class Equipes extends Equipe {
    private  ArrayList<Equipe> contemEquipes;

    public Equipes(String nomeEquipe) {
        super(nomeEquipe);
        this.contemEquipes = new ArrayList<Equipe>();
    }

    public int quantidadeEquipes(){
        return this.contemEquipes.size();
    }
    public ArrayList<Equipe> getContemEquipes() {
        return contemEquipes;
    }
    public void addEquipe(ArrayList<Equipe> equipe){
        this.contemEquipes.addAll(equipe);
    }
    @Override
    public String toString() {
        String retorno = "\nQuantidade de Equipes:" + this.quantidadeEquipes()  + "\nEquipes" + this.getContemEquipes();
        return retorno;
    }

    
    
    
    
  
  
    
}

