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
public class Canvas {
    private int altura;
    private int longitud;
    private String colorDeFondo;

    public final int getAltura() {
        return altura;
    }

    public final void setAltura(int altura) {
        this.altura = altura;
    }

    public final int getLongitud() {
        return longitud;
    }

    public final void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public final String getColorDeFondo() {
        return colorDeFondo;
    }

    public final void setColorDeFondo(String colorDeFondo) {
        this.colorDeFondo = colorDeFondo;
    }
}
