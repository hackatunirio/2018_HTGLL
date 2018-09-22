package com.app.htgll.htgllhackunirio;

public class Depoimento {
    private String nome;
    private String data;
    private String texto;
    private String curso;
    private int id;

    public Depoimento(String nome, String data, String texto, String curso, int id) {
        this.nome = nome;
        this.data = data;
        this.texto = texto;
        this.curso = curso;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getId() {
        return id;
    }
}
