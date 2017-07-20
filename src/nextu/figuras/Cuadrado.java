package nextu.figuras;

/**
 * Created by arthur on 20/07/2017.
 */
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    protected double area() {
        return Math.sqrt(lado);
    }

    @Override
    protected double perimetro() {
        return lado * 4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
