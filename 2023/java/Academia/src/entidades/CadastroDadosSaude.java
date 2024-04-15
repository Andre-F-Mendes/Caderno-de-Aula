/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author 08050431
 */
public class CadastroDadosSaude implements DAO{
    private ArrayList cadastro = new ArrayList();

    @Override
    public boolean inserir(Object obj) {
        if (obj != null && obj instanceof DadosSaude) {
            DadosSaude ds = (DadosSaude) obj;
            return this.cadastro.add(ds);
        }
        return false;
    }

    @Override
    // obj serÃ¡ o dataRegistro (LocalDate) dos DadosSaude
    public boolean excluir(Object obj) {
        if (obj != null && obj instanceof DadosSaude) {
            LocalDate dataRegistro = (LocalDate) obj;
            DadosSaude ds = (DadosSaude) this.pesquisar(dataRegistro);
            return cadastro.remove(ds);
        }
        return false;

    }

    @Override
    public boolean editar(Object obj) {
        if (obj != null && obj instanceof DadosSaude) {
            DadosSaude ds1 = (DadosSaude) obj;
            DadosSaude ds2 = (DadosSaude) pesquisar(ds1.getDataRegistro());
            if(ds2 != null){
                this.cadastro.set(cadastro.indexOf(ds1), ds2);
                return true;
            }  
        }
        return false;
    }

    @Override
    // obj serÃ¡ o dataRegistro (LocalDate) dos DadosSaude
    // retorna o DadosSaude dono da dataRegistro informado
    public Object pesquisar(Object obj) {
        if (obj != null && obj instanceof DadosSaude) {
            LocalDate dataRegistro = (LocalDate) obj;
            Iterator it = cadastro.iterator();
            while (it.hasNext()) {
                DadosSaude ds = (DadosSaude) it.next();
                if (ds.getDataRegistro().equals(dataRegistro)) {
                    return ds;
                }
            }
        }
        return null;
    }
    
}