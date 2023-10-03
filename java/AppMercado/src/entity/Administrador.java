package model.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author andre
 */
public class Administrador extends Pessoa {

    private int codigo;
    private String senha;
    private List<Compra> compras;
    private Carrinho carrinho;
    
    public Administrador(String nome, String sobrenome, String cpf, LocalDate dataNascimento, Endereco endereco, int codigo, String senha) {
        super(nome, sobrenome, cpf, dataNascimento, endereco);
        setCodigo(codigo);
        setSenha(senha);
        compras = new ArrayList<>();
        carrinho = new Carrinho();
    }
    
    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void addCompra(Compra compra) {
        this.compras.add(compra);
    }

    public void removeCompra(Compra compra) {
        this.compras.remove(compra);
    }

    public void exibirLista() {
        for (Compra c : compras) {
            System.out.println(c.toString());
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.codigo;
        hash = 17 * hash + Objects.hashCode(this.senha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrador other = (Administrador) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        return "Administrador: " + getNome() + "\nID: " + getCodigo() + "\n";
    }
    
    

}
