package Vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */

import Modelo.Lienzo;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PnlLienzo extends JPanel {
    
    private Lienzo lienzo;

    public void setLienzo(Lienzo lienzo) {
        this.lienzo = lienzo;
    }
    
    @Override
    public void paint(Graphics g) {
        System.out.println("Pintando Objetos");
        if (lienzo == null){
            super.paint(g);
            return;
        }
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < lienzo.getFiguras().size(); i++) {
            lienzo.getFigura(i).draw(g2);
         }
        
    }
    
}
