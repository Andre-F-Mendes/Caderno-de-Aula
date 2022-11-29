package MenuRPG;

public class Guerreiro extends Pessoa {

    private String guerreiroTalentos = ("Adaptabilidade BarreiraMística CantoMonástico ConhecimentoMágico ContraMágica DominarMagia EscudodaFé EscreverPergaminhos Familiar FocoemMagia MagiaCamuflada MagiadosBecos MagiaNatural MagiaCombatente MédicoDeCampo PoderDoRebanho PoderMágico PrepararPoções ResíduoMágicoCurativo SacerdoteCopista TeseArcana Metamagia AcelerarMagia AmpliarMagia AumentarMagia ElevarMagia EsculpirMagia EstenderMagia InvocaçãoAberrante MagiaCongelante MagiaConspurcada MagiaCorrosiva MagiaEletrizante MagiaExplosiva MagiaPrimordial MagiaSantificada MagiasemGestos MagiaSilenciosa MaximizarMagia PotencializarMagia ToqueLongínquo");
    private String guerreiroItens;

    public Guerreiro(String nomeJogador, String nomePersonagem, String tamanho, int idade, int nivel) {
        super(nomeJogador, nomePersonagem, tamanho, idade, nivel);
        
        setTitulo("Guerreiro");

        setTalentosLista(this.guerreiroTalentos);
        setItensLista(this.guerreiroTalentos);
    }
    
    @Override
    public void addItem(int pos, double totalCarga) {
        if(isMaestria()){
            super.addItem(pos, getHabilidade(3)*3);
        }else{
            super.addItem(pos, getHabilidade(0)*3);
        }
    }
   
    //Aumenta 20 anos, recebe titulo novo, ganha força e constituição, perde carisma e inteligencia, addItens passa a ser 3.5, contagem de duelos e duelos ganhos.
    @Override
    public void maestria() {
        // double valor = ((getHabilidade(3) + getHabilidade(4))/2.0) * 0.5;

        if(getTamanhoItens() >= 60 && !isMaestria()){
            setTitulo("Nobre");

            if(!isMaestria()){
                setMaestria(true);
                setDinheiro((getTamanhoItens() + getDinheiro() * (getNivel())));
                
                for(int i = 1; i < 6; i++){
                    setHabilidade(i, 10.0);
                }
                System.out.println("Você largou a vida de guerreiro e se tornou um: " + getTitulo());
            }
        }
    }
    
}
