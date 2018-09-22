package com.app.htgll.htgllhackunirio;

public class Evento{
    private String nome;
    private String resumo;
    private String data;
    private String foto;
    private int id;

    public Evento(String nome, String resumo, String data, String foto, int id) {
        this.nome = nome;
        this.resumo = resumo;
        this.data = data;
        this.foto = foto;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getId() {
        return id;
    }
}