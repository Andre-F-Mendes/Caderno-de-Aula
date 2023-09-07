/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import model.entity.Carrinho;
import model.entity.ItensCarrinho;
import model.entity.Produto;
import util.Tipo;

/**
 *
 * @author andre
 */
public class CarrinhoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto(0, "Lacta","70% cacao", "Barra de chocolate 70% cacao", 20, 7.99, Tipo.BENS_DE_CONSUMO);
        Produto produto1 = new Produto(1, "Garoto", "Chocolate Branco", "Barra de chocolate branco", 10, 3.99, Tipo.BENS_DE_CONSUMO);
        Produto produto2 = new Produto(2, "Nestlé","Meio Amargo", "Barra de chocolate meio amargo", 5, 5.99, Tipo.BENS_DE_CONSUMO);
        
        Carrinho carrinho = new Carrinho();
        
        carrinho.addLista(produto, 10);
        carrinho.addLista(produto, 10);
        carrinho.addLista(produto1, 2);
        
        carrinho.exibirLista();
        
        
    }
}
