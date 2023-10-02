package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.entity.Carrinho;
import model.entity.Endereco;
import model.entity.Entrega;
import model.entity.Produto;
import model.entity.Usuario;
import util.Tipo;
import util.UnidadeFederacao;

/**
 *
 * @author 08050431
 */
public class EntregaTeste {
    public static void main(String[] args) {
        
        //Produtos
        Produto p = new Produto(0, "Lacta", "Ao leite", "Chocolate ao leite", 100, 2.99, Tipo.SERVIÇOS);
        
        //Datas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("03/07/2003", formato);
        LocalDate prazoEntrega = LocalDate.parse("15/09/2023", formato);
        LocalDate dataCompra = LocalDate.now();
        
        //Usuarios
        Usuario usuario = new Usuario("André", "04021740031", dataNascimento, "a@a.con", "madrelajj22!");
        
        //Endereços
        Endereco endereco = new Endereco("Salão", "Brasil", "Capão da Canoa", "Santa Luzia", "Rua Dona Alice", 115, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        
        //Carrinho
        Carrinho carrinho = new Carrinho();
        
        carrinho.addLista(p, 10);
        
        Entrega entrega = new Entrega(usuario, endereco, carrinho, prazoEntrega, dataCompra);
        
        System.out.println(entrega.toString());
        
    }
}
