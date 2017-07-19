/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.buscador;

/**
 *
 * @author arthur.picerna
 */
public class ResultadoElemento {
    private String nombre;
    private String url;

    public ResultadoElemento(String nombre) {
        this.nombre = nombre;
        this.url = "http://" + nombre + ".com";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
