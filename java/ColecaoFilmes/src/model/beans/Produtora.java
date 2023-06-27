/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.beans;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author andre
 */
public class Produtora {
    private String nome, localizacao, ceo;;
    private final LocalDate dataCriacao;

    public Produtora(String nome, String localizacao, String ceo, LocalDate dataCriacao) {
        setNome(nome);
        setLocalizacao(localizacao);
        setCeo(ceo);
        this.dataCriacao = dataCriacao;
        
    }
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
    public String getNome() {
        return nome;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public String getCeo() {
        return ceo;
    }
    public void setNome(String nome) {
        if(nome == null) System.out.println("Uepaaaa");
        try {
            this.nome = nome;    
        } catch (Exception e) {
            Objects.requireNonNull(nome, "Valor inválido:" + e);
        }
    }
    public void setLocalizacao(String localizacao) {
        try {
            this.localizacao = localizacao;
        } catch (Exception e) {
            Objects.requireNonNull(localizacao, "Valor inválido:" + e);
        }
    }
    public void setCeo(String ceo) {

        try {
            this.ceo = ceo;
        } catch (Exception e) {
            Objects.requireNonNull(localizacao, "Valor inválido:" + e);
        }
    }

    public static void main(String[] args) {
        
        Produtora p = new Produtora(123, null, null, null);

    }
    
    
}
