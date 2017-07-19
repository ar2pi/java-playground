/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.reddefotos;

import java.util.Date;

/**
 *
 * @author arthur.picerna
 */
public class Comentario {
    private String comentario;
    private Date fecha;
    private Foto foto;
    private Usuario Comentador;

    public Comentario(String comentario, Foto foto, Usuario Comentador) {
        this.comentario = comentario;
        this.foto = foto;
        this.Comentador = Comentador;
        this.fecha = new Date();
    }
    
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Usuario getComentador() {
        return Comentador;
    }

    public void setComentador(Usuario Comentador) {
        this.Comentador = Comentador;
    }
     
}
