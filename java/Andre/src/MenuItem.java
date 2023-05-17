
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 08050431
 */
public class MenuItem implements Comparable{
    
    private Integer cod;
    private String descricao;
    private double valor;
    
    public MenuItem(Integer cod, String descricao, double valor) {
        setCod(cod);
        setDescricao(descricao);
        setValor(valor);
    }
    
    
    /**
     * @return the cod
     */
    public Integer getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(Integer cod) {
        // TODO: Fazer o teste de consistência dos dados de entrada
        this.cod = cod;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        // TODO: Fazer o teste de consistência dos dados de entrada
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        // TODO: Fazer o teste de consistência dos dados de entrada
         this.valor = valor;
    }

    @Override
    public String toString() {
        return "MenuItem{" + "cod=" + cod + ", descricao=" + descricao + ", valor=" + valor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.cod;
        hash = 23 * hash + Objects.hashCode(this.descricao);
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
        final MenuItem other = (MenuItem) obj;
        return this.cod.equals(other.cod);
    }
    
    //TODO: Criar o método que irá permitir ordenar os MenuItem pelo valor

    @Override
    public int compareTo(Object o) {
        MenuItem m = (MenuItem) o;
    }
     
}
