package model.entity;

import java.util.Objects;

/**
 *
 * @author andre
 */
public class ItensCarrinho {
    private Produto produto;
    private int quantidade;
    
    public ItensCarrinho(){
        
    }
    
    public ItensCarrinho(Produto produto, int quantidade){
        setProduto(produto);
        setQuantidade(quantidade);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        Objects.requireNonNull(produto);
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0 || quantidade > produto.getQuantidade()){
            throw new IllegalArgumentException("Preço não pode ser negativo e nem maior que a quantidade disponivel" + "\n quantidade " +
                    produto.getNome() + ": " + produto.getQuantidade());
        }
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return "Produto: " + produto.getNome() + " | Tipo: " + produto.getTipo().getTipoProduto() + 
                " | Descrição: " + produto.getDescricao() + " | Valor: R$" + produto.getPreco() + 
                " | Quantidade: " + getQuantidade() + " | Total: R$" + (getQuantidade() * produto.getPreco()) + "\n";
    }
    
}
