/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Academia;

/**
 *
 * @author 08050520
 */
public interface DAO {
    
    public boolean create (Object obj);
    public Object read (Object obj);
    public boolean update (Object obj);
    public boolean delete (Object obj);
    
}
