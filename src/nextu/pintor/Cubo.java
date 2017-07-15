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
public class Cubo extends Figura {
    private Double lado;
    
    public Cubo() {
        this.lado = this.getAltura();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
