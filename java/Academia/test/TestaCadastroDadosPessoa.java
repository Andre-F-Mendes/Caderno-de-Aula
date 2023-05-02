package java.Academia.test;

import entidades.CadastroDadosPessoa;
import entidades.Pessoa;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class TestaCadastroDadosPessoa {
    
    public static void main(String[] args) {
        CadastroDadosPessoa dados = new CadastroDadosPessoa();
        Pessoa p1 = new Pessoa("1234", "Ana", 'f', LocalDate.now());
        Pessoa p2 = new Pessoa("4567", "Luiz", 'm', LocalDate.now());
        Pessoa p3 = new Pessoa("7890", "Maria", 'f', LocalDate.now());
        //----------------------------------
        System.out.println("TESTE DO INSERIR");
        boolean b = dados.inserir(p1);
        exibeResultado(b, "inserir"); //Sucesso
        b = dados.inserir(p1);
        exibeResultado(b, "inserir"); //Erro
        b = dados.inserir(p2);
        exibeResultado(b, "inserir"); //Sucesso
        b = dados.inserir(p3);
        exibeResultado(b, "inserir"); //Sucesso
        b = dados.inserir(null);
        exibeResultado(b, "inserir"); //Erro
        //----------------------------------
        System.out.println("TESTE DO EXCLUIR");
        b = dados.excluir("1234");
        exibeResultado(b, "excluir"); //Sucesso
        b = dados.excluir("1234");
        exibeResultado(b, "excluir"); //Erro
        b = dados.excluir(null);
        exibeResultado(b, "excluir"); //Erro
        b = dados.excluir("9876");
        exibeResultado(b, "excluir"); //Erro
        //----------------------------------
        System.out.println("TESTE DO EDITAR");
        p2.setNome("Luiz Alfredo Magalhães");
        b = dados.editar(p2);
        exibeResultado(b, "editar"); //Sucesso
        Pessoa p = (Pessoa) dados.pesquisar("4567");
        System.out.println("Achou ?" + p);
    }
    
    public static void exibeResultado (boolean b, String operacao){
        if (b){
            System.out.println("Sucesso na operação !");
        } else {
            System.out.println("Erro na operação " + operacao);
        }
    }
    
}
