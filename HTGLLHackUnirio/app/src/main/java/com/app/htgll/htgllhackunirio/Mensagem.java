package com.app.htgll.htgllhackunirio;

public class Mensagem {
    private String texto;
    private int idRemet;
    private int idDestin;
    private int id;
    private boolean lida;

    public Mensagem(String texto, int idRemet, int idDestin, int id) {
        this.texto = texto;
        this.idRemet = idRemet;
        this.idDestin = idDestin;
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getIdRemet() {
        return idRemet;
    }

    public void setIdRemet(int idRemet) {
        this.idRemet = idRemet;
    }

    public int getIdDestin() {
        return idDestin;
    }

    public void setIdDestin(int idDestin) {
        this.idDestin = idDestin;
    }

    public boolean isLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
    }

    public int getId() {
        return id;
    }
}
