package com.ediel.notas.web;

/**
 * Created by dev2 on 23/04/2018.
 */

public class Nota {
    int id;
    String titulo;
    String texto;
    String created_At;
    String last_modification;

    public Nota(int id, String titulo, String texto, String created_At, String last_modification) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.created_At = created_At;
        this.last_modification = last_modification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCreated_At() {
        return created_At;
    }

    public void setCreated_At(String created_At) {
        this.created_At = created_At;
    }

    public String getLast_modification() {
        return last_modification;
    }

    public void setLast_modification(String last_modification) {
        this.last_modification = last_modification;
    }
}
