package dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.dao.ClienteDAO;
import model.dao.PessoaDAO;
import model.entity.Cliente;
import model.entity.Endereco;
import model.entity.Pessoa;
import util.UnidadeFederacao;

/**
 *
 * @author andre
 */
public class ClienteDAOTeste {
    public static void main(String[] args) {
        //DAO
        ClienteDAO cdao = ClienteDAO.getInstance();
        
        
        //Datas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("03/07/2003", formato);
        LocalDate dataNascimento1 = LocalDate.parse("03/12/2013", formato);
        LocalDate dataNascimento2 = LocalDate.parse("03/03/2004", formato);

        //Endereços
        Endereco endereco = new Endereco("Casa", "Brasil", "Capão da Canoa", "Santa Luzia", "Rua Dona Alice", 115, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        Endereco endereco1 = new Endereco("Casarão", "Brasil", "Capão da Canoa", "Santa Luzia", "Rua Dona Alice", 115, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        Endereco endereco2 = new Endereco("Casa", "Brasil", "Capão da Canoa", "Centro", "Rua Moacir", 2426, UnidadeFederacao.RIO_GRANDE_DO_SUL);

        //Pessoas
        Pessoa pessoa = new Pessoa("André", "Mendes", "04021740031", LocalDate.parse("03/07/2003", formato), endereco);
        Pessoa pessoa2 = new Pessoa("Maria", "Luiza", "04021740031", dataNascimento2, endereco2);
        Pessoa pessoa3 = new Pessoa("Paulo", "Hernandes", "04021740031", dataNascimento1, endereco1);

        //Clientes
        Cliente cliente = new Cliente(pessoa.getNome(), pessoa.getSobrenome(), pessoa.getCpf(), pessoa.getDataNascimento(), pessoa.getEndereco(), "a@a.com", "12345678");
        Cliente cliente2 = new Cliente(pessoa2.getNome(), pessoa2.getSobrenome(), pessoa2.getCpf(), pessoa2.getDataNascimento(), pessoa2.getEndereco(), "c@c.com", "12345678");
        Cliente cliente3 = new Cliente(pessoa3.getNome(), pessoa.getSobrenome(), pessoa3.getCpf(), pessoa3.getDataNascimento(), pessoa3.getEndereco(), "a@a.com", "12345678");

        //Teste CREATE Produto no PessoaDAO
        System.out.println("-----------------------------------Teste CREATE-----------------------------------");
        testaRetorno(cdao.create(cliente), "CREATE");//sucesso
        testaRetorno(cdao.create(cliente2), "CREATE");//sucesso
        testaRetorno(cdao.create(cliente3), "CREATE");//erro mesmo email
        
        //Testa READ PessoaDAO
        System.out.println("-----------------------------------Teste READ-----------------------------------");
        testaRetorno(cdao.read("a@a.com") != null, "READ");//sucesso
        testaRetorno(cdao.read(cliente.getEmail()) != null, "READ");//sucesso
        testaRetorno(cdao.read(cliente2.getEmail()) != null, "READ");//erro
        
        System.out.println("-----------------------------------Teste UPDATE-----------------------------------");
        testaRetorno(cdao.update(cliente3), "UPDATE");//troca para Paulo
        System.out.println(cdao.listarClientes());
        
        System.out.println("-----------------------------------Teste DELETE-----------------------------------");
        testaRetorno(cdao.delete(cliente.getEmail()), "DELETE");//sucesso
        
        //Listando as pessoas da lista
        System.out.println(cdao.listarClientes());
        System.out.println(PessoaDAO.getInstance().listarPessoas());
    }
    //testa se as operações foram corretas
    public static void testaRetorno(boolean b, String operacao) {
        if (b) { // testa se b == true
            System.out.println("Operacao realizada com sucesso!");
        } else {
            System.out.println("Falha na operacao de " + operacao);
        }
    }
}
