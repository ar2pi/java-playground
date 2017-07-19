/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.buscador;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author arthur.picerna
 */
public class Pagina {
    private ArrayList<ResultadoElemento> resultados;
    private int numero;

    public Pagina(int num) {
        this.numero = num;
    }

    public void addResultado(ResultadoElemento resultado) {
        this.resultados.add(resultado);
    }
    
    public List<ResultadoElemento> getResultados() {
        return resultados;
    }

    public void setResultados(ArrayList<ResultadoElemento> resultados) {
        this.resultados = resultados;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
