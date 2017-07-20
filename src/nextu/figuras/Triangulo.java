package nextu.figuras;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arthur on 20/07/2017.
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;
    private List<Double> lados;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double a, double b, double c) {
        this.lados = new ArrayList<Double>(3);
        this.lados.add(a);
        this.lados.add(b);
        this.lados.add(c);
        System.out.println(this.lados);
    }

    @Override
    protected double area() {
        return (base * altura) / 2;
    }

    @Override
    protected double perimetro() {
        return lados.get(0) + lados.get(1) + lados.get(2);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public List<Double> getLados() {
        return lados;
    }

    public void setLados(List<Double> lados) {
        this.lados = lados;
    }
}
