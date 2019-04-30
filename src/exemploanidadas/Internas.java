/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Internas {
    JFrame marco;
    JPanel panel;
    JButton boton;

    public Internas() {
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton("Pon cor");
        marco.setSize(500, 200);
        
        panel.add(boton);
        panel.add(panel);
        
        boton.addActionListener(new Accion());
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        marco.setVisible(true);
        
    }
    private class Accion implements ActionListener{
       

        @Override
        public void actionPerformed(ActionEvent e) {
              panel.setBackground(Color.red);
            Toolkit.getDefaultToolkit().beep();
        }
    }
      
    
    
    
}
