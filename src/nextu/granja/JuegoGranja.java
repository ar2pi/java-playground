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
public class JuegoGranja {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Granjero granjero = new Granjero("David");
        Huevo huevo = new Huevo();
        granjero.recoger(huevo);

        usuario.toString();
        usuario.equals(huevo);
        usuario.getClass();
//        Usuario clone = (Usuario) usuario.clone();

        System.out.println(usuario.toString());
        System.out.println(usuario.equals(huevo));
//        System.out.println(usuario.equals(clone));
        System.out.println(usuario.getClass());
    }
            
}
