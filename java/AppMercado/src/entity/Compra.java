package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author andre
 */
public class Compra {
    private double totalCompra;
    private LocalDate dataCompra, dataEntrega;
    private Carrinho carrinho;
    private Endereco endereco;
    private boolean entrega = false;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Compra(Carrinho carrinho, LocalDate dataCompra, double totalCompra){
        setCarrinho(carrinho);
        setDataCompra(dataCompra);
        setTotalCompra(totalCompra);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        Objects.requireNonNull(endereco);
        this.entrega = true;
        this.endereco = endereco;
    }
 
    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        if(totalCompra < 0) throw new IllegalArgumentException("Total da compra não pode ser negativo");
        this.totalCompra = totalCompra;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        Objects.requireNonNull(dataCompra);
        this.dataCompra = dataCompra;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        Objects.requireNonNull(dataEntrega);
        this.dataEntrega = dataEntrega;
    }
    
    public String getDataCompraString() {
        return dataCompra.format(formatter);
    }
    public String getDataEntregaString() {
        return dataEntrega.format(formatter);
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        Objects.requireNonNull(carrinho);
        this.carrinho = carrinho;
    }

    @Override
    public String toString() {
        if(entrega){
            return "Compra do dia: " + getDataCompraString()+ "\nEntrega: sim\n" + 
                    getEndereco() + "\nDia de Entrega: " + getDataEntregaString()+ "\n" + "\n-----------------------Produtos-----------------------\n" + getCarrinho().exibirLista() +
                "\nTotal da Compra: " + getCarrinho().calcTotal();
        }else return "Compra do dia: " + getDataCompraString() + "\nEntrega: não" + "\n\n-----------------------Produtos-----------------------\n" + getCarrinho().exibirLista() +
                "\n\nTotal da Compra: " + getCarrinho().calcTotal() + "\n";
    }
    
    
}
