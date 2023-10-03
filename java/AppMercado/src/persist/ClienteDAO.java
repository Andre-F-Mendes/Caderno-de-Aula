package persist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import model.entity.Carrinho;
import model.entity.Cliente;
import model.entity.Pessoa;

/**
 *
 * @author andre
 */
public class ClienteDAO implements DAO {

    private static ClienteDAO cdao;

    public static ClienteDAO getInstance() {
        if (cdao == null) {
            cdao = new ClienteDAO();
        }
        return cdao;
    }

    //É private para evitar que o PessoaDAO seja criado de outra forma que
    // não seja através do método getInstance.
    public ClienteDAO() {

    }

    HashMap<String, Cliente> dados = new HashMap<>();

    @Override
    public boolean create(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof Cliente) {
            Cliente c = (Cliente) obj;
            if (!dados.containsKey(c.getEmail())) {
                Pessoa p = new Pessoa(c.getNome(), c.getSobrenome(), c.getCpf(), c.getDataNascimento(), c.getEndereco());
                if (PessoaDAO.getInstance().create(p)) {
                    dados.put(c.getEmail(), c);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof String) {
            String str = (String) obj;
            return dados.get(str);
        }
        return null;
    }

    @Override
    public boolean update(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof Cliente) {
            Cliente c = (Cliente) obj;
            if (dados.containsKey(c.getEmail())) {
                Pessoa p = new Pessoa(c.getNome(), c.getSobrenome(), c.getCpf(), c.getDataNascimento(), c.getEndereco());
                if (PessoaDAO.getInstance().update(p)) {
                    dados.replace(c.getEmail(), c);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof String) {
            String str = (String) obj;
            Cliente c = dados.get(str);
            return (dados.remove(str) != null && PessoaDAO.getInstance().delete(c.getCpf()));
        }
        return false;
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>(dados.values());
        return clientes;
    }
    
    public Carrinho retornaCarrinho(){
        
        return null;
    }
}
