import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Empregado {
    final String nome;
    final LocalDate dataContratacao;
    double salarioBase;

    public Empregado(String nome, LocalDate dataContratacao, double salarioBase){
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        String msgNulo = "O parâmetro não pode ser nulo";
        Objects.requireNonNull(nome, msgNulo);
        Objects.requireNonNull(dataContratacao, msgNulo);
        LocalDate today = LocalDate.now();
        if(dataContratacao.isAfter(today)){
            String msgErro = "Data informada é posterior a hoje";
            throw new IllegalArgumentException(msgErro);
        }
    }
    public String getNome(){
        return this.nome;
    }
    public LocalDate getDataContratacao(){
        return this.dataContratacao;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }
    public void aumentaSalarioBase(double valor){
        if(valor >=0){
            this.salarioBase = this.salarioBase + valor;
        }
    }
    public double getSalarioFinalLiquido(){
        LocalDate today = LocalDate.now();
        Period tempoTrabalho = this.dataContratacao.until(today);
        double salarioFinal = (this.salarioBase *(tempoTrabalho.getYears()*3/100.0)) + this.salarioBase;
        double salarioFinalLiquido = salarioFinal - (salarioFinal * 11/100);
        return salarioFinalLiquido;
    }
    @Override
    public String toString(){
        return this.nome+ ", sal base: " + this.salarioBase;
    }
    @Override
	public boolean equals(Object o) {
        if(o==null) return false;
        if(o==this) return true;
        if(! (o instanceof Empregado)) return false;

        Empregado aux = (Empregado)o;

        boolean compNome = this.nome.equals(aux.nome);
        boolean compDataCont = this.dataContratacao.equals(aux.dataContratacao);
        boolean compSalarioBase = this.salarioBase == (aux.salarioBase);

        return compNome && compDataCont && compSalarioBase;
    }
}
