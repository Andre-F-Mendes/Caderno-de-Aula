package ProjetoLivraria;

import java.time.Duration;
import java.time.LocalDate;

public class TesteProduto {
    public static void main(String[] args) {
        Duration batman = Duration.ofSeconds(196);
        LocalDate zeroHora = LocalDate.now();

        Produto p = new Produto("Pão", 3);
        Livro l = new Livro("Percy Jackson", 230, "Sei lá", "Trivial");
        BlueRay b = new BlueRay("Batman", 150, batman);
        Jornal j = new Jornal("Zero Hora", 33, zeroHora);
        Revista r = new Revista("Hulk", 22, "Fantasia");
        
        //Produto p1 = new Produto(null, 2);
        //Livro l2 = new Livro("Só isso", 5, null, "Trivial");
        //Livro l3 = new Livro("Aqueles", 5, "Jovem Nerd", null);
        //BlueRay b2 = new BlueRay("Batman", 150, null);
        //Jornal j1 = new Jornal("Zero Hora", 33, null);
        //Revista r1 = new Revista("Hulk", 22, null);
        
        
        System.out.println(p.toString());
        System.out.println(l.toString());
        System.out.println(b.toString());
        System.out.println(j.toString());
        System.out.println(r.toString());
    }
}