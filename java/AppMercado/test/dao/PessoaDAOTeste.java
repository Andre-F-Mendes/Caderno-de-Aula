package dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import persist.PessoaDAO;
import model.entity.Endereco;
import model.entity.Pessoa;
import util.UnidadeFederacao;

/**
 *
 * @author andre
 */
public class PessoaDAOTeste {
    public static void main(String[] args) {
        //PessoDAO
        PessoaDAO pdao = PessoaDAO.getInstance();
        
        //Datas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("03/07/2003", formato);
        LocalDate dataNascimento1 = LocalDate.parse("03/12/2013", formato);
        LocalDate dataNascimento2 = LocalDate.parse("03/03/2004", formato);
        
        //Endereços
        Endereco endereco = new Endereco("Casa","Brasil", "Capão da Canoa", "Santa Luzia", "Rua Dona Alice", 115, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        Endereco endereco1 = new Endereco("Casarão", "Brasil", "Capão da Canoa", "Santa Luzia", "Rua Dona Alice", 115, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        Endereco endereco2 = new Endereco("Casa","Brasil", "Capão da Canoa", "Centro", "Rua Moacir", 2426, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        
        //Pessoas
        Pessoa pessoa = new Pessoa("André", "Mendes", "04021740031", dataNascimento, endereco);
        Pessoa pessoa1 = new Pessoa("Paulo", "Hernandes", "04021740031", dataNascimento1, endereco1);
        Pessoa pessoa2 = new Pessoa("Maria", "Luisa", "10012232234", dataNascimento2, endereco2);
        Pessoa pessoa3 = new Pessoa("Luara", "Machado", "203322122", dataNascimento2, endereco2);
        
        //Teste CREATE Produto no PessoaDAO
        System.out.println("-----------------------------------Teste CREATE-----------------------------------");
        testaRetorno(pdao.create(pessoa), "CREATE");//SUCESSO
        testaRetorno(pdao.create(pessoa1), "CREATE");//SUCESSO
        testaRetorno(pdao.create(pessoa2), "CREATE");//SUCESSO
        
        //Testa READ PessoaDAO
        System.out.println("-----------------------------------Teste READ-----------------------------------");
        testaRetorno(pdao.read("04021740031") != null, "READ");//sucesso
        testaRetorno(pdao.read(pessoa.getCpf()) != null, "READ");//sucesso
        testaRetorno(pdao.read("0302913340") != null, "READ");//erro
        testaRetorno(pdao.read(pessoa2.getCpf()) != null, "READ");//erro
        
        //Listando as pessoas da lista
        System.out.println(pdao.listarPessoas());
        
        System.out.println("-----------------------------------Teste UPDATE-----------------------------------");
        testaRetorno(pdao.update(pessoa1), "UPDATE");//troca para Paulo
        testaRetorno(pdao.update(pessoa3), "UPDATE");//troca para Paulo
        
        //Listando as pessoas da lista
        System.out.println(pdao.listarPessoas());
        
        System.out.println("-----------------------------------Teste DELETE-----------------------------------");
        testaRetorno(pdao.delete(pessoa.getCpf()), "DELETE");//erro
        testaRetorno(pdao.delete(pessoa3), "DELETE");//erro
        testaRetorno(pdao.delete(pessoa2.getCpf()), "DELETE");//erro
        
        //Listando as pessoas da lista
        System.out.println(pdao.listarPessoas());
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
