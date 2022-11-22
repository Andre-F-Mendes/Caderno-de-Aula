package MenuRPG;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Pessoa {
    private int forc, des, con, inte, sab, car;
    private final String nomeJogador, nomePersonagem;
    private int idade = 0, nivel = 0;
    private String tamanho;
    private ArrayList<String> talentos = new ArrayList<>();
    private ArrayList<String> talentosClasse = new ArrayList<String>();
    
    public Pessoa(String nomeJogador, String nomePersonagem, String tamanho, int idade, int nivel){
        this.nomeJogador = Objects.requireNonNull(nomeJogador, "Seu nome não pode ser nulo");
        this.nomePersonagem = Objects.requireNonNull(nomePersonagem, "Nome do personagem não pode ser nulo");
        this.tamanho = Objects.requireNonNull(tamanho, "tamanho não pode ser nulo");
       
        if(idade <= 0){
            throw new IllegalArgumentException("Idade não pode ser menor ou igual a zero");
        }
        if(nivel <= 0 || nivel > 20){
            throw new IllegalArgumentException("Nível não pode ser menor ou igual a zero e nem maior que vinte");
        }
        this.idade = idade;
        this.nivel = nivel;
    }
    public int getIdade(){
        return this.idade;
    }
    // retorna o nivel da pessoa
    public int getNivel() {
        return this.nivel;
    }
    // retorna o tamanho da pessoa
    public String getTamanho() {
        return this.tamanho;
    }
    // retorna os talentos da pessoa
    public String getTalentos(){
        String talento = " ";
        for(int i = 0; i < this.talentos.size(); i++ ){
            talento += "\n" + this.talentos.get(i);
        }
        return talento;
    }
    public int getTamanhoTalentos(){
        return this.talentos.size();
    }
    // retorna um talento da lista em especifico
    public String getTalentosListaEspecifico(int pos) {
        return talentosClasse.get(pos);
    }
    // retorna toda a lista de talentos
    public ArrayList<String> getTalentosLista() {
        return talentosClasse;
    }
    // adiciona a lista de talentos
    public void setTalentosLista(String osTalentos) {
        for(String l : osTalentos.split(" ")){
           this.talentosClasse.add(l);
        }
    }
    //adiciona um talento da lista para os talentos da pessoa
    public void addTalento(int pos){
        String posTalento = this.talentosClasse.get(pos);
        if(getTamanhoTalentos() < Math.ceil(getNivel()/2.0)){
            this.talentos.add(posTalento);
        }else throw new IllegalArgumentException("O seu nível não permite adicionar tantos talentos");
    }
    
}
  