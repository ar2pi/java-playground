/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.pintor;

/**
 *
 * @author arthur.picerna
 */
public class AplicacionDeDibujo {
    public static void main(String[] args) {
        Canvas canvas = new Lienzo();
        Instrumento pincel = new Pincel();
        pincel.setColor("negro");
        pincel.pintar();
    }
}
