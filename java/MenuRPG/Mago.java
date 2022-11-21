package MenuRPG;

import java.util.ArrayList;

public class Mago extends Pessoa {
    private String talentosMago = "Adaptabilidade BarreiraMística CantoMonástico ConhecimentoMágico ContraMágica DominarMagia EscudodaFé EscreverPergaminhos Familiar FocoemMagia MagiaCamuflada MagiadosBecos MagiaNatural MagiaCombatente MédicoDeCampo PoderDoRebanho PoderMágico PrepararPoções ResíduoMágicoCurativo SacerdoteCopista TeseArcana Metamagia AcelerarMagia AmpliarMagia AumentarMagia ElevarMagia EsculpirMagia EstenderMagia InvocaçãoAberrante MagiaCongelante MagiaConspurcada MagiaCorrosiva MagiaEletrizante MagiaExplosiva MagiaPrimordial MagiaSantificada MagiasemGestos MagiaSilenciosa MaximizarMagia PotencializarMagia ToqueLongínquo");

    

    public Mago(String nomeJogador, String nomePersonagem, String tamanho, int idade, int nivel) {
        super(nomeJogador, nomePersonagem, tamanho, idade, nivel);
    }



    @Override
    public void addTalentosClasse() {
        for(String l : talentosMago.split(" ")){
            super.setTalentosClasse(l);
        }
        
    }

    


    
    
}
