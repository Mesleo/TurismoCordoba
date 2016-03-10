package com.example.anonimo1.turismocordoba;

import java.io.Serializable;

/**
 * Created by anonimo1 on 17/02/2016.
 */
public class Sitio implements Serializable{

    private int imagen;
    private String titulo;
    private String descripcion;

    private String historia;

    public Sitio(int imagen, String titulo, String descripcion, String historia) {
        setImagen(imagen);
        setTitulo(titulo);
        setDescripcion(descripcion);
        setHistoria(historia);
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
