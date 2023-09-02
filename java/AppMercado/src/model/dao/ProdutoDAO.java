package model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import model.entity.Produto;

/**
 *
 * @author andre
 */
public class ProdutoDAO implements DAO{
    
    private static ProdutoDAO prdao;
    
    public static ProdutoDAO getInstance() {
        if (prdao == null) {
            prdao = new ProdutoDAO();
        }
        return prdao;   
    }
    
     //É private para evitar que o PessoaDAO seja criado de outra forma que
    // não seja através do método getInstance.
    public ProdutoDAO(){
        
    }
    
    private HashMap<Integer, Produto> dados = new HashMap<>();
    
    @Override
    public boolean create(Object obj) {
        if(obj != null && obj instanceof Produto){
            Produto p = (Produto) obj;
            int id = this.dados.size() + 1;
            if(!dados.containsValue(p)){
                p.setId(id);
                dados.put(p.getId(), p);
                return true;
            }
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        Objects.requireNonNull(obj);
        if(obj instanceof Integer){
            Integer i = (Integer) obj;
            return dados.get(i);
        }
        return null;
    }

    @Override
    public boolean update(Object obj) {
        Objects.requireNonNull(obj);
        if(obj instanceof Produto){
            Produto p = (Produto) obj;
            if(dados.containsKey(p.getId())){
                dados.replace(p.getId(), p);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        Objects.requireNonNull(obj);
        if(obj instanceof Integer){
            Integer i = (Integer) obj;
            return (dados.remove(i) != null);
        }
        return false;
    }
    
    public List<Produto> listarProdutos() {
    List<Produto> produtos = new ArrayList<>(dados.values());
    return produtos;
}
    
}
