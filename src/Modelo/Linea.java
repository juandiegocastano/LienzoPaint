/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Linea extends Figura {

    public Linea() {
        puntosDeEsquinas = new ArrayList<>();
        System.out.println("Linea creada con exito! ");
        setNombre("Objeto linea");
    }

       

    @Override
    public void draw(Graphics2D g) {
        if(puntosDeEsquinas.size()==2){    
        g.drawLine(puntosDeEsquinas.get(0).getX(),puntosDeEsquinas.get(0).getY(), 
                puntosDeEsquinas.get(1).getX(), puntosDeEsquinas.get(1).getY());
        }
    }

    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
