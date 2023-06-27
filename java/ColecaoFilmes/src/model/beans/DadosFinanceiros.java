/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.beans;

/**
 *
 * @author andre
 */
public class DadosFinanceiros {
    private double custoProducao;
    private double valorArrecadado;

    public DadosFinanceiros(double custoProducao, double valorArrecadado) {
        setCustoProducao(custoProducao);
        setValorArrecadado(valorArrecadado);
    }

    public double getCustoProducao() {
        return custoProducao;
    }
    public double getValorArrecadado() {
        return valorArrecadado;
    }
    public void setValorArrecadado(double valorArrecadado) {
        if(valorArrecadado >= 0){
            this.valorArrecadado = valorArrecadado;
        } else {
            throw new IllegalArgumentException("Valor inválido: " + valorArrecadado);
        }
    }
    public void setCustoProducao(double custoProducao) {
        if(custoProducao >= 0){
            this.custoProducao = custoProducao;
        } else {
            throw new IllegalArgumentException("Valor inválido: " + custoProducao);
        }
    }
    @Override
    public String toString() {
        return "Custo de producao: " + custoProducao +
                "\nValor arrecadado: " + valorArrecadado;
    }
}
