package entity;

import java.time.LocalDate;

/**
 *
 * @author 08050431
 */
public class Entrega {
    private Usuario cliente;
    private Endereco enderecoEntrega;
    private Carrinho carrinho;
    private LocalDate prazoEntrega, dataCompra;
    
    public Entrega(Usuario cliente, Endereco enderecoEntrega, Carrinho carrinho, LocalDate prazoEntrega, LocalDate dataCompra){
        setCliente(cliente);
        setEnderecoEntrega(enderecoEntrega);
        setCarrinho(carrinho);
        setPrazoEntrega(prazoEntrega);
        setDataCompra(dataCompra);
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public LocalDate getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(LocalDate prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    @Override
    public String toString() {
        return "Compra doa dia: " + getDataCompra() + getCarrinho() + "Data de entrega: " + getPrazoEntrega();
    }
    
}
