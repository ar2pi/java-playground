package nextu.banco;

/**
 * Created by arthur on 20/07/2017.
 */
public interface PrestamoBancario {
    double verSaldo();
    void pagar(double monto);
    void depositar(double monto);
    void retirar(double monto);
}