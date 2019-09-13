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
public abstract class Figura{
    
    ArrayList<Coordenada> puntosDeEsquinas;

    private String nombre;

    public ArrayList<Coordenada> getPuntosDeEsquinas() {
        return puntosDeEsquinas;
    }

    public void setPuntosDeEsquinas(ArrayList<Coordenada> puntosDeEsquinas) {
        this.puntosDeEsquinas = puntosDeEsquinas;
    }
    
    public int[] getXCoords(){
        int[] xCoords = null;
        for(int i=0; i < puntosDeEsquinas.size(); i++){
            xCoords[i] = puntosDeEsquinas.get(i).getX();
        }
        return xCoords;
    }
    
    public int[] getYCoords(){
        int[] yCoords = null;
        for(int i=0; i < puntosDeEsquinas.size(); i++){
            yCoords[i] = puntosDeEsquinas.get(i).getY();
        }
        return yCoords;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public abstract void draw(Graphics2D g);
    
}
