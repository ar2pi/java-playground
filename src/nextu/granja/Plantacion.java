package nextu.granja;

/**
 * Created by arthur on 17/07/2017.
 */
public class Plantacion extends Producto {
    private Double superficie;

    public Double calcularProduccion() {
        return getSuperficie() * getRendimiento();
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }
}
