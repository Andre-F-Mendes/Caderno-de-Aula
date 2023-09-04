
package model.entity;

/**
 *
 * @author andre
 */
public enum Tipo {
    BENS_DE_CONSUMO("Bens de Consumo"),
    SERVIÇOS("Serviços"),
    BENS_DE_USO_COMUM("Bens de Uso Comum"),
    BENS_DE_EMERGÊNCIA("Bens de Emergência"),
    BENS_DURÁVEIS("Bens Duráveis"),
    PRODUTOS_ESPECIAIS("Produtos Especiais");
    
    private final String tipoProduto;
    
    Tipo(String tipoProduto){
        this.tipoProduto = tipoProduto;
    }
 
    public String getTipoProduto(){
        return this.tipoProduto;
    }
    
    
}
