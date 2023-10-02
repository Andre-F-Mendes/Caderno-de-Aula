package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.entity.Carrinho;
import model.entity.Compra;
import model.entity.Endereco;
import model.entity.Produto;
import util.Tipo;
import util.UnidadeFederacao;

/**
 *
 * @author andre
 */
public class CompraTeste {

    public static void main(String[] args) {
        
        //Datas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataEntrega = LocalDate.parse("01/12/2023", formato);
        
        //Endereços
        Endereco endereco = new Endereco("Casa", "Brasil", "Capão da Canoa", "Santa Luzia", "Rua Dona Alice", 115, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        Endereco endereco1 = new Endereco("Vó", "Brasil", "Capão da Canoa", "Centro", "Rua Moacir", 2426, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        Endereco endereco2 = new Endereco("Toca do dragão", "Brasil", "Osório", "Encruzilhadas", "Sempre Vivas", 2023, UnidadeFederacao.RIO_GRANDE_DO_SUL);
    
        //Produtos
        Produto produto = new Produto(0, "Lacta","70% cacao", "Barra de chocolate 70% cacao", 20, 7.99, Tipo.BENS_DE_CONSUMO);
        Produto produto1 = new Produto(1, "Garoto", "Chocolate Branco", "Barra de chocolate branco", 10, 3.99, Tipo.BENS_DE_CONSUMO);
        Produto produto2 = new Produto(2, "Nestlé","Meio Amargo", "Barra de chocolate meio amargo", 5, 5.99, Tipo.BENS_DE_CONSUMO);
        
        //Carrinhos
        Carrinho carrinho = new Carrinho();
        Carrinho carrinho1 = new Carrinho();
        Carrinho carrinho2 = new Carrinho();
        
        
        carrinho.addLista(produto, 20);//primeiro carrinho vai ter só 1 produtos com 20 do mesmo
        
        carrinho1.addLista(produto, 20);//segundo carrinho vai ter dois produtos com 20 de um e 2 de outro
        carrinho1.addLista(produto1, 2);
        
        carrinho2.addLista(produto, 13);//terceiro carrinho tem todos os produtos mas em quantidade variada
        carrinho2.addLista(produto2, 2);
        carrinho2.addLista(produto1, 7);
        
        Compra compra = new Compra(carrinho, dataCompra, carrinho.calcTotal());
        Compra compra1 = new Compra(carrinho1, dataCompra, carrinho1.calcTotal());
        Compra compra2 = new Compra(carrinho2, dataCompra, carrinho2.calcTotal());
        
        System.out.println(compra.toString());
        System.out.println(compra1.toString());
        System.out.println(compra2.toString());
        
        compra1.setDataEntrega(dataEntrega);
        compra1.setEndereco(endereco);
        
        System.out.println(compra1.toString());
    }
    
}
