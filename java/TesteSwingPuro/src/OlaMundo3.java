//import java.awt.BorderLayout;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author mk
 */
public class OlaMundo3 extends JFrame {

    private JLabel label1, label2, label3, label4, label5;
    private JTextField txtField;

    public OlaMundo3() {

        super("Minha Ter    ceira Interface");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        label1 = new JLabel();
        label1.setText("Minha Terceira Interface");
        label2 = new JLabel("O Java é legal !");
        label3 = new JLabel("by Karen");
        label4 = new JLabel("2023");
        label4.setFont(new Font("Serif", Font.PLAIN, 24));

        label5 = new JLabel();
        ImageIcon img = new ImageIcon("src/images/PatoRemelexo.gif");
        Image image = img.getImage();
        Image newing = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
        label5.setIcon(img);
        
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(label5);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(275, 170);
        setVisible(true);

    }

    public static void main(String[] args) {
        new OlaMundo3();
    }

}
