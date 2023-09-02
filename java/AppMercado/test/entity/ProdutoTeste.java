package entity;

import model.entity.Tipo;
import model.entity.Produto;

/**
 *
 * @author andre
 */
public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto produto1 = new Produto("Lacta", "Chocolate meio amargo", 10, 4.99, Tipo.BENS_DE_CONSUMO);
        
        System.out.println(produto1.toString());

    }
}
