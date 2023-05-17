
import java.util.*;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 08050431
 */
public class Menu {
    
    //TODO: Declarar um HashMap chamado servicos para conter MenuItem. A chave é o código de MenuItem
    HashMap<Integer, Double> servicos = new HashMap<>();
    
    public static boolean cadastrarItem(MenuItem m){
        //TODO: Inserir MenuItem nos servicos
        if(m != null && m instanceof MenuItem){
            servicos.put(m.getCod(), );
            return true;
        }
        return false;
    }
    
    public static boolean descadastrarItem(Integer cod){
        //TODO: Remover dos servicos o MenuItem correspondente ao cod.
        return false;
    }
    
    public static void listarMenu(){
       //TODO: Listar o Menu
        
    }
    
    public static void listarMenuOrdenado(){
        //TODO: Listar o Menu ordenado pelo preco dos servicos
    }
    
   
    
}
