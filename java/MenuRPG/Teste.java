package MenuRPG;

import java.math.MathContext;

public class Teste {
    
    public static void main(String[] args) {
        String magoTalentos = ("Adaptabilidade BarreiraMística CantoMonástico ConhecimentoMágico ContraMágica DominarMagia EscudodaFé EscreverPergaminhos Familiar FocoemMagia MagiaCamuflada MagiadosBecos MagiaNatural MagiaCombatente MédicoDeCampo PoderDoRebanho PoderMágico PrepararPoções ResíduoMágicoCurativo SacerdoteCopista TeseArcana Metamagia AcelerarMagia AmpliarMagia AumentarMagia ElevarMagia EsculpirMagia EstenderMagia InvocaçãoAberrante MagiaCongelante MagiaConspurcada MagiaCorrosiva MagiaEletrizante MagiaExplosiva MagiaPrimordial MagiaSantificada MagiasemGestos MagiaSilenciosa MaximizarMagia PotencializarMagia ToqueLongínquo");
        
        Pessoa andre = new Mago("André", "UNTIL", "MEDIO", 23, 4);

        //System.out.println(andre.getIdade());

        andre.setTalentosLista(magoTalentos);

        // System.out.println(andre.getTalentosLista());
        // System.out.println(andre.getTalentosListaEspecifico(0));
        
        andre.addTalento(0);
        andre.addTalento(1);
        andre.addTalento(2);
        // andre.addTalento(3);
        


        System.out.println(andre.getTalentos());

    }
}
