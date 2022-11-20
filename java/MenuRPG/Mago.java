package MenuRPG;

public class Mago extends Pessoa {

    public Mago(String nomeJogador, String nomePersonagem, String tamanho, int idade, int nivel) {
        super(nomeJogador, nomePersonagem, tamanho, idade, nivel);
    }

    public int getGetIdade() {
        return super.getIdade();
    }
}
