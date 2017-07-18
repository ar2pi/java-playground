package nextu.granja;

/**
 * Created by arthur on 17/07/2017.
 */
public class Animal extends Producto {
    private int cantidad;

    public Double calcularProduccion() {
        return getCantidad() * getRendimiento();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
