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
public class Rectangulo extends Figura{

    public Rectangulo() {
        puntosDeEsquinas = new ArrayList<>();
        System.out.println("Rectangulo creado con exito!");
        setNombre("Objeto rectangulo");
    }
    


    @Override
    public void draw(Graphics2D g) {
        if(puntosDeEsquinas.size()== 4){
            g.drawPolygon(getXCoords(), getYCoords(), 4); 
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
