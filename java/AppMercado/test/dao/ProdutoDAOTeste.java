package dao;

import model.dao.ProdutoDAO;
import model.entity.Produto;
import model.entity.Tipo;


/**
 *
 * @author andre
 */
public class ProdutoDAOTeste {
    public static void main(String[] args) {
        
        //ProdutoDAO que salva os produtos
        ProdutoDAO prdao = ProdutoDAO.getInstance();
        
        //Produtos
        Produto produto = new Produto(0, "Lacta", "ao leite", "um barra de chocolate ao leite", 10, 4.99, Tipo.BENS_DE_CONSUMO);
        Produto produto2 = new Produto(0, "Neugebauer", "cookies", "um barra de chocolate com cookies", 5, 5.99, Tipo.BENS_DE_CONSUMO);
        Produto produto3 = new Produto(1, "Garoto", "70% cacao", "um barra de chocolate meio amarga", 20, 7.99, Tipo.BENS_DE_CONSUMO);
        
        //Teste CREATE Produto no ProdutoDAO
        System.out.println("-----------------------------------Teste CREATE-----------------------------------");
        testaRetorno(prdao.create(produto), "CREATE");//sucesso
        testaRetorno(prdao.create(produto2), "CREATE");//erro
        testaRetorno(prdao.create(produto3), "CREATE");//sucesso
        testaRetorno(prdao.create(produto3), "CREATE");//erro
        
        //Listar os valores atuais
        System.out.println(prdao.listarProdutos());
        
        //Testa READ ProdutoDAO
        System.out.println("-----------------------------------Teste READ-----------------------------------");
        testaRetorno(prdao.read(0) != null, "READ");//sucesso
        testaRetorno(prdao.read(produto.getId()) != null, "READ");//sucesso
        testaRetorno(prdao.read(1) != null, "READ");//sucesso
        testaRetorno(prdao.read(3) != null, "READ");//erro
        
        //listar os valores atuais
        System.out.println(prdao.listarProdutos());
        
        
        System.out.println("-----------------------------------Teste UPDATE-----------------------------------");
        testaRetorno(prdao.update(produto2), "UPDATE");//troca para Neugebauer
        
        //listar os valores atuais
        System.out.println(prdao.listarProdutos());
        
        System.out.println("-----------------------------------Teste DELETE-----------------------------------");
        testaRetorno(prdao.delete(produto.getId()), "DELETE");//erro
        testaRetorno(prdao.delete(produto3), "DELETE");//erro
        testaRetorno(prdao.delete(produto3.getId()), "DELETE");//erro
        
        
        
        System.out.println(prdao.listarProdutos());
        
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
