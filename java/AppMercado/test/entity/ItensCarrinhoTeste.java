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
        Produto produto = new Produto(0, "Lacta","70% cacao", "Barra de chocolate 70% cacao", 20, 7.99, Tipo.BENS_DE_CONSUMO);
        Produto produto1 = new Produto(1, "Garoto", "Chocolate Branco", "Barra de chocolate branco", 10, 3.99, Tipo.BENS_DE_CONSUMO);
        Produto produto2 = new Produto(2, "Nestlé","Meio Amargo", "Barra de chocolate meio amargo", 5, 5.99, Tipo.BENS_DE_CONSUMO);
        
        ItensCarrinho carrinho = new ItensCarrinho(produto, 10);
        
        
        System.out.println(carrinho);
        
        carrinho.setProduto(produto1);
        
        System.out.println(carrinho);
        
        carrinho.setQuantidade(21);
        
        System.out.println(carrinho);
        
    }
}
