
package model.entity;

/**
 *
 * @author andre
 */
public enum Tipo {
    BENS_DE_CONSUMO("Bens de Consumo"),
    SERVICOS("Serviços"),
    BENS_DE_USO_COMUM("Bens de Uso Comum"),
    BENS_DE_EMERGENCIA("Bens de Emergência"),
    BENS_DURAVEIS("Bens Duráveis"),
    PRODUTOS_ESPECIAIS("Produtos Especiais");
    
    private final String tipoProduto;
    
    Tipo(String tipoProduto){
        this.tipoProduto = tipoProduto;
    }
 
    public String getTipoProduto(){
        return this.tipoProduto;
    }
    
    
}
