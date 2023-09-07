package entity;

import model.entity.Endereco;
import util.UnidadeFederacao;

/**
 *
 * @author andre
 */
public class EnderecoTeste {
    public static void main(String[] args) {
        
        
        
        Endereco endereco = new Endereco("Casa", "Brasil",
                "Capão da canoa", "Santa Luzia", "Rua Dona Alice", 115, UnidadeFederacao.RIO_GRANDE_DO_SUL);
        
        System.out.println(endereco.toString());
        
    }
}
