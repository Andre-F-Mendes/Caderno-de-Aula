/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;

import java.util.*;

/**
 *
 * @author 08050431
 */
public class Pessoa {
    private String nome;
    private final String cpf;
    private int idade;

    public Pessoa(String nome, String cpf, int idade) {
        Objects.requireNonNull(nome, "atributo não pode ser nulo");
        Objects.requireNonNull(cpf, "atributo não pode ser nulo");
        
     
        this.nome = nome;
        this.cpf = cpf;
        if(this.idade< 0){ 
            throw new IllegalArgumentException("Não pode ser menor que zero"); 
        }
        this.idade = idade;
    }   

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public int getIdade() {
        return this.idade;
    }
    
}