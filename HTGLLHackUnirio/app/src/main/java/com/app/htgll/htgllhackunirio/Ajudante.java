package com.app.htgll.htgllhackunirio;

public class Ajudante {
    private String email;
    private String senha;
    private String nome;
    private String matricula;
    private String id;

    private Ajudante(String email,String senha ,String nome,String matricula,String id){
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.matricula = matricula;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getId() {
        return id;
    }
}
