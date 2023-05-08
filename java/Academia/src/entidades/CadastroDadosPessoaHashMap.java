/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.*;

/**
 *
 * @author 08050431
 */
public class CadastroDadosPessoaHashMap implements DAO {
        
    HashMap<String, Pessoa> dados = new HashMap<>();
    
    
    
    @Override
    public boolean inserir(Object obj) {
        if (obj != null && obj instanceof Pessoa) {
            Pessoa e = (Pessoa) obj;
            dados.put(e.getCpf(), e);
            return true;
        }
        return false;
    }

    @Override
    public boolean excluir(Object obj) {
        if (obj != null && obj instanceof String) {
            String cpf = (String) obj;
            return(dados.remove(cpf) !=null);
        }
        return false;
    }

    @Override
    public boolean editar(Object obj) {
        if (obj != null && obj instanceof Pessoa) {
            Pessoa e = (Pessoa) obj;
            if(excluir(e.getCpf()) == true){
                return inserir(e);
            }
        }
        return false;
    }

    @Override
    //Em obj está o cpf
    public Object pesquisar(Object obj) {
        if (obj != null && obj instanceof String) {
            String cpf = (String) obj;
            return dados.get(cpf);
        }
        return null;
    }
    
    public void listar() {
        for (Map.Entry<String, Pessoa> linha : dados.entrySet()) {
            System.out.println(linha);
        }
    }    
}