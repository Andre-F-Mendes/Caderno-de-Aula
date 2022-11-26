package MenuRPG;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Pessoa {
    //Força, Destreza, Constituição, Inteligência, Sabedoria, Carisma
    private double[] habilidades = new double[6], modificadores = new double[6];
    private final String nomeJogador, nomePersonagem, tamanho;
    private int idade, nivel = 1;
    private double carga;
    private ArrayList<String> talentos = new ArrayList<>();
    private ArrayList<String> itens = new ArrayList<>();
    private ArrayList<String> talentosLista = new ArrayList<>();
    private ArrayList<String> itensLista = new ArrayList<>(); 

    //construtor
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
    
    public double getCarga() {
        return carga;
    }
    //retorna o nnome do Persogem
    public String getNomePersonagem() {
        return nomePersonagem;
    }
    //retorna o nome do Jogador
    public String getNomeJogador() {
        return nomeJogador;
    }
    //retorna a idade da pessoa
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
    // retorna toda a lista de talentos
    public ArrayList<String> getTalentosLista() {
        return this.talentosLista;
    }
    // retorna um talento da lista em especifico
    public String getTalentosListaEspecifico(int pos) {
        return talentosLista.get(pos);
    }
    //retorna os talentos da pessoa
    public String getTalentos(){
        String talento = " ";
        for(int i = 0; i < this.talentos.size(); i++ ){
            talento += "\n" + this.talentos.get(i);
        }
        return talento;
    }
    //retorna um talento em especifo dos talentos da pessoa
    public String getTalento(int pos){
        return this.talentos.get(pos);
    }
    //retorna o quantos talentos tem
    public int getTamanhoTalentos(){

        return this.talentos.size();
    }
    // retorna toda a lista de itens
    public ArrayList<String> getItensLista() {
        return this.itensLista;
    }
    //retorna um Item Especifoc da Lista (IEL)
    public String getIEL(int pos) {
        return this.itensLista.get(pos);
    }
    //retorna os itens da pessoa
    public String getItens(){
        String itens = " ";
        for(int i = 0; i < this.itens.size(); i++ ){
            itens += "\n" + this.itens.get(i);
        }
        return itens;
    }
    //retorna retorna um item especifico da pessoa
    public String getItem(int pos){
        return this.itens.get(pos);
    }
    //retorna o quanto de itens a pessoa tem
    public int getTamanhoItens(){
        
        return this.itens.size();
    }
    //retorna o valor da habilidade
    public String getHabilidades() {
        String valor = " ";
        for(int i = 0; i < this.habilidades.length; i++){
            switch (i) {
                case 0:
                    valor += "Força: " + this.habilidades[i];
                    break;
                case 1:
                    valor += ", Destreza: " + this.habilidades[i];
                    break;
                case 2:
                    valor += ", Constituição: " + this.habilidades[i];
                    break;
                case 3:
                    valor += ", Inteligência: " + this.habilidades[i];
                    break;
                case 4:
                    valor += ", Sabedoria: " + this.habilidades[i];
                    break;
                case 5:
                    valor += ", Carisma: " + this.habilidades[i];
                    break;
            }
        }
        return valor;
    }
    //retorna o valor do modificador de habilidade
    public String getModificadores(){
        for(int i = 0; i < this.habilidades.length; i++){
            if(this.habilidades[i]%2 == 1){
                modificadores[i] = Math.ceil( (this.habilidades[i]-10) / 2.0);
            }else modificadores[i] = (this.habilidades[i] - 10)/2.0; 
        }
        String valor = " ";
        for(int i = 0; i < this.modificadores.length; i++){
            switch (i) {
                case 0:
                    valor += "Força: " + this.modificadores[i];
                    break;
                case 1:
                    valor += ", Destreza: " + this.modificadores[i];
                    break;
                case 2:
                    valor += ", Constituição: " + this.modificadores[i];
                    break;
                case 3:
                    valor += ", Inteligência: " + this.modificadores[i];
                    break;
                case 4:
                    valor += ", Sabedoria: " + this.modificadores[i];
                    break;
                case 5:
                    valor += ", Carisma: " + this.modificadores[i];
                    break;
            }
        }
        return valor;
    }
    
    public void setCarga(double carga) {
    this.carga = carga;
    }
    //adiciona a lista de talentos
    public void setTalentosLista(String osTalentos) {
        for(String l : osTalentos.split(" ")){
            this.talentosLista.add(l);
        }
    }
    //adiciona a lista de Itens
    public void setItensLista(String osItens) {
        for(String l : osItens.split(" ")){
            this.itensLista.add(l);
        }
    }  
    //recebe vetor como parameto e coloca os valores
    public void setHabilidades(double[] habilidades) {
        this.habilidades = habilidades;
    }
    //aumenta em 1 a habilidade na posição pedida
    public void aumentaHabilidade(int pos){
        this.habilidades[pos] += 1;
    }
    //adiciona um talento da lista para os talentos da pessoa
    public void addTalento(int pos){
        if(getTamanhoTalentos() < Math.ceil(getNivel()/2.0)){
            this.talentos.add(this.talentosLista.get(pos));
        }else throw new IllegalArgumentException("O seu nível não permite adicionar tantos talentos");
    }
    //adiciona um item da lista para os itens da pessoa
    public void addItens(int pos){
        if(this.getTamanhoItens() > this.getCarga()){
            throw new IllegalArgumentException("Você não pode carregar mais itens do que você consegue");
        }else this.itens.add(this.itensLista.get(pos));
    }
    //adiciona +1 na idade
    public void fazAniversario(){
        this.idade += 1;
    }
    //aumenta o nível em +1
    public void upNivel(){
        if(this.nivel >= 20){
            throw new IllegalArgumentException("Você atingiu o nível máximo");
        }else this.nivel += 1;
    }
    //maestria de classe
    public abstract void maestria();
    

}
