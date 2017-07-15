/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.pintor;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author arthur.picerna
 */
public class Triangulo extends Figura {
    private List<Double> lados;
    private List<Double> angulos;
    
    public Triangulo() {
        this.lados = new ArrayList<>(3);
        this.angulos = new ArrayList<>(3);
    }

    public List<Double> getLados() {
        return lados;
    }

    public void setLados(List<Double> lados) {
        this.lados = lados;
    }

    public List<Double> getAngulos() {
        return angulos;
    }

    public void setAngulos(List<Double> angulos) {
        this.angulos = angulos;
    }
}
