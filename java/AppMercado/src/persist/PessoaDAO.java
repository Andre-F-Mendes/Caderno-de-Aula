package persist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import model.entity.Pessoa;

/**
 *
 * @author andre
 */
public class PessoaDAO implements DAO{
    private static PessoaDAO pdao;
    
    public static PessoaDAO getInstance() {
        if (pdao == null) {
            pdao = new PessoaDAO();
        }
        return pdao;   
    }
    
     //É private para evitar que o PessoaDAO seja criado de outra forma que
    // não seja através do método getInstance.
    public PessoaDAO(){
        
    }
    
    HashMap<String, Pessoa> dados = new HashMap<>();
    
    @Override
    public boolean create(Object obj) {
        Objects.requireNonNull(obj);
        if(obj instanceof Pessoa){
            Pessoa p = (Pessoa) obj;
            if(!dados.containsKey(p.getCpf())){
                dados.put(p.getCpf(), p);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        Objects.requireNonNull(obj);
        if(obj instanceof String){
            String str = (String) obj;
            return dados.get(str);
        }
        return null;
    }

    @Override
    public boolean update(Object obj) {
        Objects.requireNonNull(obj);
        if(obj instanceof Pessoa){
            Pessoa p = (Pessoa) obj;
            if (dados.containsKey(p.getCpf())) {
                dados.replace(p.getCpf(), p);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof String) {
            String str = (String) obj;
            return (dados.remove(str) != null);
        }
        return false;
    }
    
    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>(dados.values());
        return pessoas;
    }
}
