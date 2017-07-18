/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.granja;

/**
 *
 * @author arthur.picerna
 */
public class Granjero {
    private String nombre;

    public Granjero(String nombre) {
        this.setNombre(nombre);
    }

    public void cosechar(Plantacion plantacion) {
        System.out.println("Cosechando " + plantacion.getTipo() + "...");
    }

    public void recoger(Producto producto) {
        System.out.println("Recogiendo " + producto.getTipo() + "...");
    }

    public void comprar(Animal animal){};

    public void sembrar(Plantacion plantacion) {};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
