package com.app.htgll.htgllhackunirio;

import android.support.constraint.solver.widgets.Snapshot;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.Serializable;

public class Anonimo implements Serializable {
    private String email;
    private String senha;
    private int id;
    public Anonimo(){

    }
    public Anonimo(String email, String senha, int id){
        this.email = email;
        this.senha = senha;
        this.id = id;
    }
    public Anonimo(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(Object o){
        Anonimo anonimo = (Anonimo)o;
        if(this.id==anonimo.id||this.email.equals(anonimo.email)){
            return true;
        }
        else{
            return false;
        }

    }

}
