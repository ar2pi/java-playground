package nextu.granja;

/**
 * Created by arthur on 17/07/2017.
 */
public class Producto {
    private String tipo;
    private Double rendimiento; // all that is producible has a yield
    private String origin; // to indicate tipo de origen if applicable
    private Double precio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Double rendimiento) {
        this.rendimiento = rendimiento;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
