
package exemploanidadas;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ifernandezblanco
 */
public class ClaseAnonima {
     JFrame marco;
    JPanel panel;
    JButton boton;

    public ClaseAnonima() {
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton("Pon cor");
        marco.setSize(500, 200);
        
        panel.add(boton);
        panel.add(panel);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.red);
            }
           
        });
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    
}
