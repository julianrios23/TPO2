package com.julian.tpo2.Book;

import java.io.Serializable;

public class Libros implements Serializable {
    private String titulo;
    private String autor;
    private String anio;
    private int portadaResId;

    public Libros(String titulo, String autor, String anio, int portadaResId) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.portadaResId = portadaResId;
    }

    // Constructor anterior para compatibilidad
    public Libros(String titulo, String autor, String anio) {
        this(titulo, autor, anio, 0);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnio() {
        return anio;
    }

    public int getPortadaResId() {
        return portadaResId;
    }
}
