public class Garagem{
    
    private final String nome;
    private final String endereco;
    private final int qtdeVagas;
    private final Carro [] carrosEstacionados;
    private int qtdeCarros = 0;

    public Garagem(String nome, String endereco, int qtdeVagas){
        this.nome = nome;
        this.endereco = endereco;
        this.qtdeVagas = qtdeVagas;
        this.carrosEstacionados = new Carro[this.qtdeVagas];
    }
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public int getQtdeVagas(){
        return this.qtdeVagas;
    }
    /* -estaciona(Carro c): estaciona um carro, desde que parado e desligado, adicionando na próxima
posicao do vetor vaga (pode ser necessário uma variável para controlar quantos carros estão
estacionados - assim como você utilizou a quantidade de notas de um Estudante, em exercício
anterior); Retorna true se conseguiu estacionar e false caso não tenha conseguido estacionar o carro
(por exemplo quando a garagem está cheia ou o carro não está parado e desligado)
 */
    public boolean estaciona(Carro c){
        if(this.qtdeCarros>=qtdeVagas && c.isLigado() == false && c.getvelocidade() == 0){
            this.carrosEstacionados[this.qtdeCarros] = c;
            this.qtdeCarros++;
            return true;
        }else {
            return false;
        }
    }
    /* -retira(int pos): retira um carro do estacionamento na posição (do vetor) passada por parâmetro.
Deve retornar o carro retirado do vetor ou null caso não tenha carro na posiao passada por
parâmetro.
 */
    public Carro retira(int pos){
        //criando uma variavel tipo Carro e lançando um throw deixa de ser necessario dois if
        Carro retorno = null;

        //nao precisa mais se preocupar com os resultados invalidos
        if(pos> 0 || pos>=this.qtdeCarros){
            throw new IllegalArgumentException("posição inválida");
        }
        //retorno vai ser o valor do vetor, se for null, sera null e se for um objeto carro, tera suas informações
        retorno = this.carrosEstacionados[pos];
        //daqui pra baixo eu nao entendi
        for(int i = pos+1; i<this.qtdeCarros; i++){
            this.carrosEstacionados[i - 1] = this.carrosEstacionados[i]; 
        }//
        
        this.qtdeCarros--;
        return retorno;
    }
    /* -getVagas(): retorna quantas vagas ainda existem disponíveis no estacionamento  */
    public int getVagas(){
        return this.qtdeVagas - qtdeCarros;
    }
}