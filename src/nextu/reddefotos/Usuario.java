/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.reddefotos;

/**
 *
 * @author arthur.picerna
 */
public class Usuario {
    private String nombre;
    private String id;
    private Galeria galeria;
    private Usuario[] amigos;
    
    private class Mural {
        
    }

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Galeria getGaleria() {
        return galeria;
    }

    public void setGaleria(Galeria galeria) {
        this.galeria = galeria;
    }

    public Usuario[] getAmigos() {
        return amigos;
    }

    public void setAmigos(Usuario[] amigos) {
        this.amigos = amigos;
    }
    
    
}
