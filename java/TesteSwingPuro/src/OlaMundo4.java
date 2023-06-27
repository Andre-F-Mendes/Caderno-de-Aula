
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class OlaMundo4 extends JFrame {
      private JLabel label1, label2, label3, label4;
    private JTextField txtField;
    
    public OlaMundo4(){
    
     super("Minha Terceira Interface");
        
        Container c = getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.PAGE_AXIS));
        //c.setLayout(new BoxLayout(c, BoxLayout.LINE_AXIS));
               
        label1 = new JLabel();
        label1.setText("Minha Terceira Interface");
        label2 = new JLabel ("O Java é legal !");
        label3 = new JLabel ("by Karen");
        label4 = new JLabel("2023");
        
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(275, 170);
        setVisible(true);  
        
    }
    
    public static void main(String[] args) {
        new OlaMundo4();
    }

}
