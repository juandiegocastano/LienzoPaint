/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Circulo;
import Modelo.Coordenada;
import Modelo.Figura;
import Modelo.Lienzo;
import Modelo.Linea;
import Modelo.Rectangulo;
import Modelo.Triangulo;
import Vista.PnlLienzo;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControladorPaint {
    private PnlLienzo pnlLienzo;
    private Lienzo lienzo;
    private ArrayList<Coordenada> clicks;
    private String figuraSeleccionada;

    public ControladorPaint() {
        lienzo =  new Lienzo();
        clicks = new ArrayList<>();
    }
    
    public Lienzo getLienzo() {
        return lienzo;
    }


    public void actualizarLienzo() {
        switch(figuraSeleccionada){
            case("triangulo"):
                System.out.println("Entro al case! ");
                if(clicks.size()==3){
                    Figura triangulo = new Triangulo();
                    triangulo.setPuntosDeEsquinas(clicks);
//                    System.out.println(triangulo.getNombre());
//                    System.out.println(lienzo.getNombre());
                    lienzo.addFigura(triangulo);
                    vaciarClicks();
                    System.out.println("    Entro al case.if! ");
//                    refrescarLienzo();
                }
                break;  
            case("cuadrado"):
                System.out.println("Entro al case! ");
                if(clicks.size()==4){
                    Figura rectangulo = new Rectangulo();
                    rectangulo.setPuntosDeEsquinas(clicks);
                    lienzo.addFigura(rectangulo);
                    vaciarClicks();
                    System.out.println("    Entro al case.if! ");
                }
                break;   
            case("circulo"):
                System.out.println("Entro al case! ");
                if(clicks.size()==1){
                    Figura circulo = new Circulo();
                    circulo.setPuntosDeEsquinas(clicks);
                    lienzo.addFigura(circulo);
                    vaciarClicks();
                    System.out.println("    Entro al case.if! ");
                }
                break;
            case("linea"):
                System.out.println("Entro al case! ");
                if(clicks.size()==2){
                    Figura linea = new Linea();
                    linea.setPuntosDeEsquinas(clicks);
                    lienzo.addFigura(linea);
                    vaciarClicks();
                    System.out.println("    Entro al case.if! ");
                }
                break;
        }
    }

    private void refrescarLienzo() {
        pnlLienzo.updateUI();
    }
    
    public void setFiguraSeleccionada(String figuraSeleccionada) {
        this.figuraSeleccionada = figuraSeleccionada;
    }


    public void setPnlLienzo(PnlLienzo pnlLienzo) {
        this.pnlLienzo = pnlLienzo;
        pnlLienzo.setLienzo(lienzo);
    }
    public void addClick(int xCoord, int yCoord){
        Coordenada clickPorAgregar = new Coordenada();
        clickPorAgregar.setX(xCoord);
        clickPorAgregar.setY(yCoord);
        clicks.add(clickPorAgregar);
    }
   
    public void vaciarClicks(){
        clicks.clear();
    }
    
    public void moverDerecha(){
        System.out.println("No soportado");    
    }
    
    public void moverIzquierda(){
        System.out.println("No soportado");    
    }

    public void printFiguras(){
        for(int i=0; i<lienzo.getFiguras().size(); i++){
            System.out.println("Figura: " + lienzo.getFigura(i).getNombre());
        }
    }
    public void printClicks(){
        for (Coordenada click : clicks) {
            System.out.println("X coord: " + click.getX() + "    Y coord: " + click.getY());
        }
    }
    
}
