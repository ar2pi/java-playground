package nextu.figuras;

/**
 * Created by arthur on 20/07/2017.
 */
public class Circulo extends Figura {
    private double rayo;

    public Circulo(double rayo) {
        this.rayo = rayo;
    }

    @Override
    protected double area() {
        return Math.PI * Math.sqrt(rayo);
    }

    @Override
    protected double perimetro() {
        return 2 * Math.PI * rayo;
    }

    public double getRayo() {
        return rayo;
    }

    public void setRayo(double rayo) {
        this.rayo = rayo;
    }
}
