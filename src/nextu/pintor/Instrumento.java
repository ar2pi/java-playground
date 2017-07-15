/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.pintor;

/**
 *
 * @author arthur.picerna
 */
public class Instrumento {
    private double anchura;
    private String color;
    private String tipo = "";

    public void pintar() {
        System.out.println("Pintando en " + color + " con " + tipo);
    }
    
    public final double getAnchura() {
        return anchura;
    }

    public final void setAnchura(double anchura) {
        this.anchura = anchura;
    }
    
    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getTipo() {
        return tipo;
    }

    public final void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
