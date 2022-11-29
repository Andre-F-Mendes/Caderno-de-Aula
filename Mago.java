package MenuRPG;



public class Mago extends Pessoa {
    String magoTalentos = ("Adaptabilidade BarreiraMística CantoMonástico ConhecimentoMágico ContraMágica DominarMagia EscudodaFé EscreverPergaminhos Familiar FocoemMagia MagiaCamuflada MagiadosBecos MagiaNatural MagiaCombatente MédicoDeCampo PoderDoRebanho PoderMágico PrepararPoções ResíduoMágicoCurativo SacerdoteCopista TeseArcana Metamagia AcelerarMagia AmpliarMagia AumentarMagia ElevarMagia EsculpirMagia EstenderMagia InvocaçãoAberrante MagiaCongelante MagiaConspurcada MagiaCorrosiva MagiaEletrizante MagiaExplosiva MagiaPrimordial MagiaSantificada MagiasemGestos MagiaSilenciosa MaximizarMagia PotencializarMagia ToqueLongínquo");


    public Mago(String nomeJogador, String nomePersonagem, String tamanho, int idade, int nivel) {
        super(nomeJogador, nomePersonagem, tamanho, idade, nivel);

        setTalentosLista(magoTalentos);
        setItensLista(magoTalentos);
        
        setTitulo("Mago");
    }

    @Override
    public void upNivel(){
        aumentaHabilidade(3);
        super.upNivel(); 
        aumentaHabilidade(4);
    }
    @Override
    public void addItem(int pos, double totalCarga) {
        if(isMaestria()){
            super.addItem(pos, getHabilidade(3)*3);
        }else{
            super.addItem(pos, getHabilidade(0)*3);
        }
        
    }
    
    @Override
    public void maestria() {
        
        if(getNivel() == 20 && getIdade() >= 85){
            setMaestria(true);
            setTitulo("Mago Implacavel");

            if(!isMaestria()){
                System.out.println("Você atingiu a maestria máxima com a classe de mago. Seu novo título é: ");
            }
        }
    }
    
    
}
