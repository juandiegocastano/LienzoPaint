/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Lienzo {
    
    String nombre;
    private ArrayList<Figura> figuras;

    public String getNombre() {
        return nombre;
    }

    public Lienzo() {
        figuras = new ArrayList<>();
        this.nombre = "Lienzoo ";
    }
    

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }
    
    public boolean addFigura(Figura figura){
        boolean add = figuras.add(figura);
        return add;
    }
    public Figura getFigura(int index){
        return figuras.get(index);
    }

}
