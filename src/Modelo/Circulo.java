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
public class Circulo extends Figura{
    
    private int radio;

    public Circulo() {
        puntosDeEsquinas = new ArrayList<>();
        System.out.println("Circulo creado con exito");
        setNombre("Objeto circulo");
    }

    @Override
    public void draw(Graphics2D g) {
        if(puntosDeEsquinas.size()== 1){
            g.drawOval(puntosDeEsquinas.get(0).getX(), puntosDeEsquinas.get(0).getY(), 
                       15, 15);
            
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
    
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
