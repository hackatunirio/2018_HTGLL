package com.app.htgll.htgllhackunirio;

public class SolicitacaoChat{
    private int idAnonimo;
    private int id;

    public SolicitacaoChat(int idAnonimo, int id) {
        this.idAnonimo = idAnonimo;
        this.id = id;
    }

    public int getIdAnonimo() {
        return idAnonimo;
    }

    public int getId() {
        return id;
    }

    public void setIdAnonimo(int idAnonimo) {
        this.idAnonimo = idAnonimo;
    }
}
