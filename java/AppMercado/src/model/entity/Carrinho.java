package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Carrinho {

    private List<ItensCarrinho> itensCarrinhoList;

    public Carrinho() {
        itensCarrinhoList = new ArrayList<>();
    }

    public void addLista(Produto p, int quant) {
        for (ItensCarrinho ic : itensCarrinhoList) {
            if (ic.getProduto().equals(p)) {
                ic.setQuantidade(ic.getQuantidade() + quant);
                return; 
            }
        }
        ItensCarrinho novoItem = new ItensCarrinho(p, quant);
        itensCarrinhoList.add(novoItem);
    }

    public double calcTotal() {
        double d = 0.0;
        for (ItensCarrinho ic : itensCarrinhoList) {
            d = d + (ic.getProduto().getPreco() * ic.getQuantidade());
        }

        return d;
    }

    public void exibirLista() {
        for (ItensCarrinho ic : itensCarrinhoList) {
            System.out.print(ic.toString());
        }
        System.out.printf("\nTotal: R$ " + calcTotal());
    }
}
