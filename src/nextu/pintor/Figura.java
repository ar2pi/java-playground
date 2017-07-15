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
public class Figura {
    
    private Figura figura;
    
    public void Figura(String tipo) {
        if(tipo.length() == 0) {
            this.figura = new Figura();
        }
        switch(tipo.toLowerCase()) {
            case "rectangulo":
                this.figura = new Rectangulo();
                break;
            case "cubo":
                this.figura = new Cubo();
                break;
            case "triangulo":
                this.figura = new Triangulo();
                break;
            default:
                this.figura = new Figura();
        }
    }
    
    private double altura;
    private double longitud;

    public final double getAltura() {
        return altura;
    }

    public final void setAltura(double altura) {
        this.altura = altura;
    }

    public final double getLongitud() {
        return longitud;
    }

    public final void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
