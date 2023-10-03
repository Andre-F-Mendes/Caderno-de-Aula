package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Carrinho {

    private double totalCompra, totalProduto;
    private List<ItensCarrinho> itensCarrinhoList;
    private List<String> itensCarrinhoListString;

    public Carrinho() {
        itensCarrinhoList = new ArrayList<>();
        itensCarrinhoListString = new ArrayList<>();

    }

    public boolean addLista(Produto p, int quantidade) {
        for (ItensCarrinho item : itensCarrinhoList) {
            if (item.getProduto().equals(p)) {
                if (item.getQuantidade() + quantidade <= p.getQuantidade()) {
                    item.setQuantidade(item.getQuantidade() + quantidade);
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (quantidade <= p.getQuantidade()) {
            ItensCarrinho novoItem = new ItensCarrinho(p, quantidade);
            itensCarrinhoList.add(novoItem);
            return true;
        } else {
            return false;
        }
    }

    public void removeProduto(Produto produto, int quantidade) {
        for (ItensCarrinho ic : itensCarrinhoList) {
            if (ic.getProduto().equals(produto)) {
                int quantidadeAtual = ic.getQuantidade();
                if (quantidade >= quantidadeAtual) {
                    itensCarrinhoList.remove(ic);
                } else {
                    ic.setQuantidade(quantidadeAtual - quantidade);
                }
                return;
            }
        }
    }

    public double calcTotal() {
        double d = 0.0;
        for (ItensCarrinho ic : itensCarrinhoList) {
            d = d + (ic.getProduto().getPreco() * ic.getQuantidade());
        }

        totalCompra = d;
        return totalCompra;
    }

    public List<String> exibirLista() {

        if (!itensCarrinhoList.isEmpty()) {
            for (ItensCarrinho ic : itensCarrinhoList) {
                itensCarrinhoListString.add(ic.toString());
            }
            return itensCarrinhoListString;
        }
        return null;
    }

    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();

        for (ItensCarrinho ic : itensCarrinhoList) {
            produtos.add(ic.getProduto());
        }

        return produtos;
    }

    public int getQuantidade() {
        if (!itensCarrinhoList.isEmpty()) {
            for (ItensCarrinho ic : itensCarrinhoList) {
                return ic.getQuantidade();
            }

        }
        return 0;
    }

    public List<ItensCarrinho> getItensCarrinhoList() {
        return itensCarrinhoList;
    }

}
