import java.time.LocalDate;

public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado jao = new Empregado("Joao Carlos", LocalDate.of(2011, 10, 10),2000);
		Empregado jao2 = new Empregado("Joao Carlos", LocalDate.of(2011, 10, 10),2000);
		Empregado jana = new Empregado("Janaina Carlitas", LocalDate.of(2022, 5, 5),5000);
		
		System.out.println(jao.toString().equals("Joao Carlos, sal base: 2000.0"));
		System.out.println(jao.equals(jao2)==true);
		
		System.out.println(jao.getNome().equals("Joao Carlos"));
		System.out.println(jao.getDataContratacao().equals(LocalDate.of(2011, 10, 10)));
		System.out.println(jao.getSalarioBase()==2000);
		//dez anos de trabalho(30% de aumento): salarioFinal = 2600
		//desconto 11%: 2314
		System.out.println(jao.getSalarioFinalLiquido()==2314);
		jao2.aumentaSalarioBase(1000);

		//dez anos de trabalho(30% de aumento): salarioFinal = 3900
		//desconto 11%: 3471
		System.out.println(jao2.getSalarioFinalLiquido()==3471);
		System.out.println(jao.equals(jao2)==false); //salarios base diferentes
		System.out.println(jao.equals(jana)==false); //pessoas diferentes (tudo diferente)
		
		
	}
}
