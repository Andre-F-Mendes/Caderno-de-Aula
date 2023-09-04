package entity;

import model.entity.Produto;
import model.entity.Tipo;

/**
 *
 * @author andre
 */
public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto produto1 = new Produto(0, "Lacta", "Ao Leite", "Barra de chocolate ao leite", 10, 4.50, Tipo.BENS_DE_CONSUMO);
        
        System.out.println(produto1.toString());

    }
}
