/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

import java.util.*;

/**
 *
 * @author 08050431
 */
public class PessoaDAO1 implements DAO {
    
    private final ArrayList<Pessoa> list = new ArrayList();

    @Override
    public boolean create(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object read(Object obj) {
        if(obj != null && obj instanceof String){
            String p1 = (String) obj;
            
            Iterator<Pessoa> i = list.iterator();
            while(i.hasNext()){
                Pessoa p1 = 
            }
        }
        return false;
    }

    @Override
    public boolean update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
