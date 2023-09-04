package model.entity;

import java.util.Objects;
import util.UnidadeFederacao;

/**
 *
 * @author andre
 */
public class Endereco {
    private String nome, pais,cidade, bairro, rua;
    private int numero;
    private UnidadeFederacao estado;
    
    public Endereco(){
        
    }

    public Endereco(String nome, String pais, String cidade, String bairro, String rua, int numero, UnidadeFederacao estado) {
        this.nome = nome;
        this.pais = pais;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        Objects.requireNonNull(pais);
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        Objects.requireNonNull(cidade);
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        Objects.requireNonNull(bairro);
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        Objects.requireNonNull(rua);
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero < 0){
            throw new IllegalArgumentException("Número não pode ser negativo");
        }
        this.numero = numero;
    }

    public UnidadeFederacao getEstado() {
        return estado;
    }

    public void setEstado(UnidadeFederacao estado) {
        Objects.requireNonNull(estado);
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + Objects.hashCode(this.pais);
        hash = 61 * hash + Objects.hashCode(this.cidade);
        hash = 61 * hash + Objects.hashCode(this.bairro);
        hash = 61 * hash + Objects.hashCode(this.rua);
        hash = 61 * hash + this.numero;
        hash = 61 * hash + Objects.hashCode(this.estado);
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
        final Endereco other = (Endereco) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        return this.estado == other.estado;
    }

    @Override
    public String toString() {
        return "Endereco{" + "nome=" + nome + ", pais=" + pais + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numero=" + numero + ", estado=" + estado + '}';
    }
}
