/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.beans;

import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Produtora {
    private String nome, localizacao, ceo;;
    private final LocalDate dataCriacao;

    public Produtora(String nome, String localizacao, String ceo, LocalDate dataCriacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.ceo = ceo;
        this.dataCriacao = dataCriacao;
    }
    
    public String getNome() {
        try
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
    
}
