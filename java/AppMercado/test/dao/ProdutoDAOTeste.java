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
        Produto produto = new Produto("Lacta", "Chocolate 70% cacao", 20, 7.99, Tipo.BENS_DE_CONSUMO);
        Produto produto1 = new Produto("Garoto", "Chocolate branco", 10, 3.99, Tipo.BENS_DE_CONSUMO);
        Produto produto2 = new Produto("Nestlé", "Chocolate meio amargo", 5, 5.99, Tipo.BENS_DE_CONSUMO);
        Produto produto3 = new Produto("Cacau Show", "Chocolate com cookies", 5, 2.99, Tipo.BENS_DE_CONSUMO);
        
        //Teste CREATE Produto no ProdutoDAO
        System.out.println("-----------------------------------Teste CREATE-----------------------------------");
        testaRetorno(prdao.create(produto), "CREATE");//sucesso
        testaRetorno(prdao.create(produto), "CREATE");//erro
        testaRetorno(prdao.create(produto1), "CREATE");//sucesso
        
        
        //Listar os valores atuais
        
        
        //Testa READ ProdutoDAO
        System.out.println("-----------------------------------Teste READ-----------------------------------");
        testaRetorno(prdao.read(produto.getId()) != null, "READ");//sucesso
        testaRetorno(prdao.read(produto1.getId()) != null, "READ");//sucesso
        testaRetorno(prdao.read(produto2.getId()) != null, "READ");//erro
        testaRetorno(prdao.read(0) != null, "READ");//erro
        
        //listar os valores atuais
        
        
        produto2.setId(1);
        
        System.out.println("-----------------------------------Teste UPDATE-----------------------------------");
        testaRetorno(prdao.update(produto2), "UPDATE");//sucesso
        testaRetorno(prdao.update(produto3), "UPDATE");//erro
        
        //listar os valores atuais
        System.out.println(prdao.listarProdutos());
        
        System.out.println("-----------------------------------Teste DELETE-----------------------------------");
        testaRetorno(prdao.delete(3), "DELETE");//erro
        testaRetorno(prdao.delete(1), "DELETE");//sucesso
        
        
        
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
