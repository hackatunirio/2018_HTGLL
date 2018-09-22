package com.app.htgll.htgllhackunirio;

import android.support.constraint.solver.widgets.Snapshot;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Anonimo {
    private String email;
    private String senha;
    private int id;
    public Anonimo(String email, String senha, int id){
        this.email = email;
        this.senha = senha;
        this.id = id;
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
    /*
    public int gerarId(){
        int maiorid = 0;
        DatabaseReference database = FirebaseDatabase.getInstance().getReference("Anonimo");
        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot Snapshot) {
                try {
                    for (DataSnapshot dataSnapshot : Snapshot.getChildren()) {
                        Anonimo value = dataSnapshot.getValue(Anonimo.class);
                        if(value.id>id){
                            maiorid = id;
                        }
                    }
                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

    }
    */
}
