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
public class Triangulo extends Figura{

    public Triangulo() {
        puntosDeEsquinas = new ArrayList<>();
        System.out.println("Triangulo creado con exito! ");
        setNombre("Objeto triangulo");
    }

    @Override
    public void draw(Graphics2D g) {
       
          g.drawPolygon(getXCoords(), getYCoords(), 3);
       
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
