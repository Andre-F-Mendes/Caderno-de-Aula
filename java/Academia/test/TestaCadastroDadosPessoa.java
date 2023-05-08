/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import entidades.*;
import java.time.LocalDate;

/**
 *
 * @author 08050431
 */
public class TestaCadastroDadosPessoa {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("1234", "Ana", 'f', LocalDate.now());
        Pessoa p2 = new Pessoa("3456", "Pedro", 'm', LocalDate.now());
        Pessoa p3 = new Pessoa("6789", "Luiz", 'm', LocalDate.now());
        Pessoa p4 = new Pessoa("9876", "Flavia", 'f', LocalDate.now());

        CadastroDadosPessoaHashMap dados = new CadastroDadosPessoaHashMap();
        
        boolean b = dados.inserir(p1);
        testaRetorno(b, "inserir");
        b = dados.inserir(p1);
        testaRetorno(b, "inserir");
        b = dados.inserir(p2);
        testaRetorno(b, "inserir");
        b = dados.inserir(p3);
        testaRetorno(b, "inserir");
        b = dados.inserir(p4);
        testaRetorno(b, "inserir");
        //----------------------------------------
        Pessoa p = (Pessoa) dados.pesquisar("1234");
        if (p != null) System.out.println("Achou " + p);
        else System.out.println("Não achou !");
        //----------------------------------------
        b = dados.excluir("1234");
        testaRetorno(b, "excluir");
        b = dados.excluir("1234");
        testaRetorno(b, "excluir");
        //------------------------------
        p2.setNome("Pedro Silva");
        b = dados.editar(p2);
        testaRetorno(b, "editar");
        p = (Pessoa) dados.pesquisar(p2.getCpf());
        if (p != null) System.out.println("Achou " + p);
        else System.out.println("Não achou !");  
        b=dados.editar(p1);
        p = (Pessoa) dados.pesquisar(p1.getCpf());
        if (p != null) System.out.println("Achou " + p);
        else System.out.println("Não achou !");
        
        dados.listar();
        
    }

    public static void testaRetorno(boolean b, String operacao) {
        if (b) { // testa se b == true
            System.out.println("Operação realizada com sucesso !");
        } else {
            System.out.println("Falha na operação de " + operacao);
        }
    }
}