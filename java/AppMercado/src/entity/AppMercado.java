package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import persist.AdministradorDAO;
import persist.ClienteDAO;
import persist.ProdutoDAO;
import util.Tipo;
import util.UnidadeFederacao;
import view.*;

/**
 *
 * @author andre
 */
public class AppMercado {
    public static void main(String[] args) {
        
        
        //Endereço
        Endereco clienteEndereco = new Endereco("Casa", "Brasil", "Capão da Canoa", "Santa Luzia", "Rua Dona Alice", 115, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        Endereco administradorEndereco = new Endereco("X", "X", "X", "X", "X", 0, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        
        //Fomato de data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        //Pessoa Pré-Criada
        Pessoa pessoaCliente = new Pessoa("André", "Mendes", "04021740031", LocalDate.parse("03/07/2003", formato), clienteEndereco);
        Pessoa pessoaAdministrador = new Pessoa("André", "Mendes", "04021740031", LocalDate.parse("31/12/9999", formato), administradorEndereco);
        
        //Cliente
        Cliente cliente = new Cliente(pessoaCliente.getNome(), pessoaCliente.getSobrenome(), pessoaCliente.getCpf(), pessoaCliente.getDataNascimento(), pessoaCliente.getEndereco(), "a@a.com", "12345678");
        
        
        //Administrador
        Administrador administrador = new Administrador(pessoaAdministrador.getNome(), pessoaAdministrador.getSobrenome(), pessoaAdministrador.getCpf(), pessoaAdministrador.getDataNascimento(), administradorEndereco, 0000, "23456789");
        
        //DAOs
        ClienteDAO.getInstance().create(cliente);
        AdministradorDAO.getInstance().create(administrador);
        
        
        //Produtos
        Produto produto = new Produto(0, "Lacta", "ao leite", "um barra de chocolate ao leite", 10, 4.99, Tipo.BENS_DE_CONSUMO);
        Produto produto2 = new Produto(1, "Neugebauer", "cookies", "um barra de chocolate com cookies", 5, 5.99, Tipo.BENS_DE_CONSUMO);
        Produto produto3 = new Produto(2, "Garoto", "70% cacao", "um barra de chocolate meio amarga", 20, 7.99, Tipo.BENS_DE_CONSUMO);

        ProdutoDAO.getInstance().create(produto);
        ProdutoDAO.getInstance().create(produto2);
        ProdutoDAO.getInstance().create(produto3);
        
        
        TelaInicio inicio = new TelaInicio();
        inicio.setVisible(true);
        
         
        
        
    }
}
