package persist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import model.entity.Administrador;
import model.entity.Pessoa;

/**
 *
 * @author andre
 */
public class AdministradorDAO implements DAO {

    private static AdministradorDAO cdao;

    public static AdministradorDAO getInstance() {
        if (cdao == null) {
            cdao = new AdministradorDAO();
        }
        return cdao;
    }

    //É private para evitar que o PessoaDAO seja criado de outra forma que
    // não seja através do método getInstance.
    public AdministradorDAO() {

    }

    HashMap<Integer, Administrador> dados = new HashMap<>();

    @Override
    public boolean create(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof Administrador) {
            Administrador a = (Administrador) obj;
            if (!dados.containsKey(a.getCodigo())) {
                Pessoa p = new Pessoa(a.getNome(), a.getSobrenome(), a.getCpf(), a.getDataNascimento(), a.getEndereco());
                if (PessoaDAO.getInstance().create(p)) {
                    dados.put(a.getCodigo(), a);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object read(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof Integer) {
            Integer i = (Integer) obj;
            return dados.get(i);
        }
        return null;
    }

    @Override
    public boolean update(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof Administrador) {
            Administrador a = (Administrador) obj;
            if (dados.containsKey(a.getCodigo())) {
                Pessoa p = new Pessoa(a.getNome(), a.getSobrenome(), a.getCpf(), a.getDataNascimento(), a.getEndereco());
                if (PessoaDAO.getInstance().update(p)) {
                    dados.replace(a.getCodigo(), a);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof Integer) {
            Integer i = (Integer) obj;
            Administrador a = dados.get(i);
            return (dados.remove(i) != null && PessoaDAO.getInstance().delete(a.getCpf()));
        }
        return false;
    }

    public List<Administrador> listarAdministradores() {
        List<Administrador> administradores = new ArrayList<>(dados.values());
        return administradores;
    }
}
