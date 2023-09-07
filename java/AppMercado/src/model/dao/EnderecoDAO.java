package model.dao;

import java.util.ArrayList;
import java.util.Objects;
import model.entity.Endereco;

/**
 *
 * @author andre
 */
public class EnderecoDAO implements DAO{

    private static EnderecoDAO edao;
    
    public static EnderecoDAO getInstance() {
        if (edao == null) {
            edao = new EnderecoDAO();
        }
        return edao;   
    }
    
     //É private para evitar que o PessoaDAO seja criado de outra forma que
    // não seja através do método getInstance.
    public EnderecoDAO(){
        
    }
    
    ArrayList<Endereco> dados = new ArrayList<>();
    
    @Override
    public boolean create(Object obj) {
        Objects.requireNonNull(obj);
        if(obj instanceof Endereco){
            Endereco endereco = (Endereco) obj;
            if()
        }
        return false;
        
    }

    @Override
    public Object read(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
