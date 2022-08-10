public class Garagem{

    private final String nome;
    private final String endereco;
    private final int qtdeVagas;
    private final Carro [] carrosEstacionados;
    private int qtEstacionados = 0;
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
    public void estaciona(Carro c){

        if(c.isLigado() == false && c.getvelocidade() == 0){
            this.carrosEstacionados[this.qtEstacionados] = c;
        }
        
    }
}