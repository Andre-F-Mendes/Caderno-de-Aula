package Academia;

import java.time.LocalDate;

public class teste {

	public static void main(String[] args) {

		CadastroPessoa ooo = new CadastroPessoa();

		LocalDate DATA = LocalDate.of(1000, 1, 1);

		Pessoa o = new Pessoa("o", DATA, 'm', "01");
		Pessoa p = new Pessoa("p", DATA, 'm', "02");
		Pessoa i = new Pessoa("i", DATA, 'm', "03");
		
		ooo.create(o);
		ooo.create(p);
		ooo.create(i);
		
		System.out.println(ooo.toString());
		
		p.setNome("ppppppppppppp");
		
		System.out.println(ooo.toString());
	}
}
