package model.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author andre
 */
public class Cliente extends Pessoa {

    private String email, senha;
    private List<Compra> compras;
    private Carrinho carrinho;

    public Cliente(String nome, String sobrenome, String cpf, LocalDate dataNascimento, Endereco endereco, String email, String senha) {
        super(nome, sobrenome, cpf, dataNascimento, endereco);
        setEmail(email);
        setSenha(senha);
        carrinho = new Carrinho();
        compras = new ArrayList<>();
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void addCompra(Compra compra) {
        if(compras.contains(compra)){
            Compra c = new Compra(compra.getCarrinho(), compra.getDataCompra(), compra.getTotalCompra());
            compras.add(c);
            return;
        }
        this.compras.add(compra);
    }

    public void removeCompra(Compra compra) {
        this.compras.remove(compra);
    }

    public void exibirLista() {
        System.out.println("\n" + getNome());
        for (Compra c : compras) {
            System.out.println(c.toString() + "\n");
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.email);
        hash = 67 * hash + Objects.hashCode(this.senha);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.email, other.email);
    }

    @Override
    public String toString() {
        return "Cliente: " + getNome() + " " + getSobrenome() +  "\nCPF: " + getCpf() + "\nEmail: " + getEmail();
    }

}
