package model.entity;


import java.util.ArrayList;
import java.util.List;
import model.entity.ItensCarrinho;
import model.entity.Produto;

/**
 *
 * @author andre
 */
public class Carrinho {
     private List<ItensCarrinho> itensCarrinhoList;

    public Carrinho(){
        itensCarrinhoList = new ArrayList<>();
    }

    public void addLista(Produto p, int quant){
        ItensCarrinho ic = new ItensCarrinho(p, quant);
        itensCarrinhoList.add(ic);
    }

    public double calcTotal(){
        double d = 0.0;
        for (ItensCarrinho ic : itensCarrinhoList){
            d = d + (ic.getProduto().getPreco() * ic.getQuantidade());
        }

        return d;
    }

    public void exibirLista(){
        for (ItensCarrinho ic : itensCarrinhoList){
            System.out.printf(ic.toString());
        }
        System.out.printf("\nTotal: R$ " + calcTotal());
    }
}