/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.buscador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arthur.picerna
 */
public class Busqueda {

    private String texto;
    private Contenido contenido;

    public Busqueda(String texto) {
        this.texto = texto;
    }

    public Busqueda(String texto, Contenido contenido) {
        this.texto = texto;
        this.contenido = contenido;
    }
    
    public ResultadoDeBusqueda buscar(List<ResultadoElemento> elementos) {
        ArrayList<ResultadoElemento> resultados = new ArrayList();
        for(ResultadoElemento elemento : elementos) {
            if(elemento.getNombre() == this.texto) {
                resultados.add(elemento);
            }
        }
        ResultadoDeBusqueda resultado = new ResultadoDeBusqueda(resultados);
        return resultado;
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }
}
