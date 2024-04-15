package entidades;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author 08050431
 */
public class CadastroDadosPessoa implements DAO {

    private TreeSet<Pessoa> cadastro = new TreeSet<Pessoa>();

    @Override
    public boolean inserir(Object obj) {
        if (obj != null && obj instanceof Pessoa) {
            Pessoa e = (Pessoa) obj;
            return cadastro.add(e);
        }
        return false;
    }

    @Override
    // obj será o cpf (String) da Pessoa
    public boolean excluir(Object obj) {
        if (obj != null && obj instanceof String) {
            String cpf = (String) obj;
            Pessoa p = (Pessoa) pesquisar(cpf);
            if (p!=null){
                return cadastro.remove(p);
            }
        }
        return false;
    }

    @Override
    // Em obj estará a Pessoa já com os dados alterados
    //exceto o cpf que vai ser usado como chave
    public boolean editar(Object obj) {
        if (obj != null && obj instanceof Pessoa) {
            Pessoa e = (Pessoa) obj;
            //boolean b = excluir(e.getCpf());
            if (excluir(e.getCpf())) { //se b == true
                return inserir(e);
            }
        }
        return false;
    }

    @Override
    // obj será o cpf (String) da Pessoa
    // retorna a Pessoa dona do cpf informado
    public Object pesquisar(Object obj) {
        if (obj != null && obj instanceof String) {
            String cpf = (String) obj;
            Iterator it = cadastro.iterator();
            while (it.hasNext()) {
                Pessoa p = (Pessoa) it.next();
                if (p.getCpf().equals(cpf)) {
                    return p;
                }
            }
        }
        return null;
    }

}
