/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 08050431
 */
public interface DAO {
    
    public boolean inserir(Object obj);
    
    // obj pode depois ser definido como o próprio objeto 
    //ou a sua chave de localização
    public boolean excluir (Object obj);
    
    // obj vai ser o objeto já com as novas informações
    // que serão atualizadas. Desse obj retiramos a chave de 
    // localização se necessário
    public boolean editar (Object obj);
    
    //Pode retornar um objeto ou uma coleção de objetos
    //O parâmetro pode ser um objeto ou uma chave ou qualquer
    //outra coisa definida dentro da classe XXXDAO
    public Object pesquisar (Object obj);
    
}
    
