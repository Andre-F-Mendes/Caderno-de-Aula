/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

import java.util.ArrayList;

/**
 *
 * @author 08050431
 */
public class NewClass {
    public static void main(String[] args) {

    ArrayList<String> aulas = new ArrayList();
    aulas.add("java");
    aulas.add("html");
    aulas.add("css");        
    System.out.println(aulas);

    aulas.sort(null);
    System.out.println("ORDENADAS: " + aulas);    
}
}
