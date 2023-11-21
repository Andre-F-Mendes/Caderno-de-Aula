package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.entity.Cliente;
import model.entity.Endereco;
import model.entity.Pessoa;
import util.UnidadeFederacao;

/**
 *
 * @author andre
 */
public class ClienteTeste {
    public static void main(String[] args) {
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("03/07/2003", formato);
        LocalDate dataNascimento1 = LocalDate.parse("03/12/2013", formato);
        LocalDate dataNascimento2 = LocalDate.parse("03/03/2004", formato);

        //Endereços
        Endereco endereco = new Endereco("Casa", "Brasil", "Capão da Canoa", "Santa Luzia", "Rua Dona Alice", 115, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        Endereco endereco1 = new Endereco("Casarão", "Brasil", "Capão da Canoa", "Santa Luzia", "Rua Dona Alice", 115, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        Endereco endereco2 = new Endereco("Casa", "Brasil", "Capão da Canoa", "Centro", "Rua Moacir", 2426, UnidadeFederacao.RIO_GRANDE_DO_SUL);

        //Pessoas
        Pessoa pessoa = new Pessoa("André", "Mendes", "04021740031", dataNascimento, endereco);
        Pessoa pessoa1 = new Pessoa("Paulo", "Hernandes", "20020020031", dataNascimento1, endereco1);
        Pessoa pessoa2 = new Pessoa("Maria", "Luisa", "10012232234", dataNascimento2, endereco2);

        //Clientes
        Cliente cliente = new Cliente(pessoa.getNome(), pessoa.getSobrenome(), pessoa.getCpf(), pessoa.getDataNascimento(), pessoa.getEndereco(), "a@a.com", "12345678");
        Cliente cliente1 = new Cliente(pessoa1.getNome(), pessoa1.getSobrenome(), pessoa1.getCpf(), pessoa1.getDataNascimento(), pessoa1.getEndereco(), "b@b.com", "12345678");
        Cliente cliente2 = new Cliente(pessoa2.getNome(), pessoa2.getSobrenome(), pessoa2.getCpf(), pessoa2.getDataNascimento(), pessoa2.getEndereco(), "c@c.com", "12345678");
        
        
        System.out.println(cliente.toString());
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        
    }

}