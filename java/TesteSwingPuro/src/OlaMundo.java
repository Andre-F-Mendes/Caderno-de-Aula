import java.awt.*;
import javax.swing.*;

/**
 *
 * @author mk
 */
public class OlaMundo extends JFrame {

    private JLabel label, label2;
  
    public OlaMundo() {
        super("Minha Primeira Interface");
        
        Container c = getContentPane();       
        label = new JLabel("Olá Mundo");
        label2 = new JLabel("Eu sou o André");
        c.add(label);
        c.add(label2);
        setSize(600, 170);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);  
    }
    
    public static void main(String[] args) {
        new OlaMundo();
    }

}
