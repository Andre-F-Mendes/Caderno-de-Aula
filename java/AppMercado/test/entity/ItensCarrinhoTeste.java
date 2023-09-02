package entity;

import model.entity.ItensCarrinho;
import model.entity.Produto;
import model.entity.Tipo;

/**
 *
 * @author andre
 */
public class ItensCarrinhoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto("Lacta", "Chocolate 70% cacao", 20, 7.99, Tipo.BENS_DE_CONSUMO);
        Produto produto1 = new Produto("Garoto", "Chocolate branco", 10, 3.99, Tipo.BENS_DE_CONSUMO);
        Produto produto2 = new Produto("Nestlé", "Chocolate meio amargo", 5, 5.99, Tipo.BENS_DE_CONSUMO);
        
        ItensCarrinho carrinho = new ItensCarrinho(produto, 10);
        
        System.out.println(carrinho);
        
        carrinho.setQuantidade(21);
        
        System.out.println(carrinho);
        
    }
}
