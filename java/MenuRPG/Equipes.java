package MenuRPG;


import java.util.ArrayList;


public class Equipes extends Equipe {
    private ArrayList<ArrayList<Pessoa>> contemEquipes = new ArrayList<ArrayList<Pessoa>>();

    public Equipes(String nomeEquipe, ArrayList<ArrayList<Pessoa>> contemEquipes) {
        super(nomeEquipe);
        this.contemEquipes = contemEquipes;
    }

    public int quantidadeEquipes(){
        return this.contemEquipes.size();
    }
    public ArrayList<ArrayList<Pessoa>> getContemEquipes() {
        return contemEquipes;
    }
    public void addEquipe(ArrayList<Pessoa> equipe){
        this.contemEquipes.add(equipe);
    }
    @Override
    public String toString() {
        String retorno = "\nQuantidade de Equipes:" + this.quantidadeEquipes()  + "\nEquipes" + this.getContemEquipes();
        return retorno;
    }

    
    
    
    
  
  
    
}

