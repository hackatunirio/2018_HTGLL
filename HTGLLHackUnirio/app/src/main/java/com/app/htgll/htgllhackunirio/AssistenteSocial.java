package com.app.htgll.htgllhackunirio;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class AssistenteSocial extends AppCompatActivity {
    private ArrayList<Anonimo> listaAnonimo;
    private ArrayList<AjudanteChat> listaAjudante;
    private DatabaseReference database;
    private int maiorid = 0;
    private boolean controle = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistente_social);
        Button botaoLogin = (Button) findViewById(R.id.botaoLogin);
        final Intent i = new Intent(this, Guest2.class);
    }
    public void cadastro(View view) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        EditText e = (EditText) findViewById(R.id.email);
        EditText s = (EditText) findViewById(R.id.senha);
        String email = e.getText().toString();
        String senha = s.getText().toString();
        if(email.equals("")||(senha.equals(""))){
            AlertDialog.Builder aviso = new AlertDialog.Builder(this);
            aviso.setTitle("Campo vazio");
            aviso.setMessage("Por favor, preecncha as informaçoes");
            aviso.setNeutralButton("Ok", null);
            aviso.show();
            return;
        }
        email = email.replace('.','P');
        MessageDigest algorithm = MessageDigest.getInstance("MD5");
        byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        senha = hexString.toString();
        Anonimo anonimo = new Anonimo(email, senha, gerarId());
        database = FirebaseDatabase.getInstance().getReference();
        database.child("Anonimo").child(anonimo.getEmail()).setValue(anonimo);
        Toast.makeText(getApplicationContext(), "Cadastrado", Toast.LENGTH_SHORT).show();


    }
    public int gerarId() {
        DatabaseReference database = FirebaseDatabase.getInstance().getReference("Anonimo");
        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot Snapshot) {
                try {
                    for (DataSnapshot dataSnapshot : Snapshot.getChildren()) {
                        Anonimo value = dataSnapshot.getValue(Anonimo.class);
                        try {
                            if(value!=null) {
                                if (value.getId() > maiorid) {
                                    maiorid++;
                                }
                            }
                        }catch (NullPointerException n){
                            maiorid = 0;
                        }

                    }
                } catch (Exception e) {
                    maiorid++;
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });
        return maiorid+1;
    }
    public void login(View view) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        EditText e = (EditText) findViewById(R.id.email);
        EditText s = (EditText) findViewById(R.id.senha);
        String email = e.getText().toString();
        String senha = s.getText().toString();
        if(email.equals("")||(senha.equals(""))){
            AlertDialog.Builder aviso = new AlertDialog.Builder(this);
            aviso.setTitle("Campo vazio");
            aviso.setMessage("Por favor, preecncha as informaçoes");
            aviso.setNeutralButton("Ok", null);
            aviso.show();
            return;
        }
        email = email.replace('.','P');
        MessageDigest algorithm = MessageDigest.getInstance("MD5");
        byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        senha = hexString.toString();
        final Intent intent = new Intent(this, Guest2.class);
        final Anonimo anonimo = new Anonimo(email, senha);
        database = FirebaseDatabase.getInstance().getReference("Anonimo/" + anonimo.getEmail());
        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Anonimo value = dataSnapshot.getValue(Anonimo.class);
                try {
                    if ((value.getEmail().equals(anonimo.getEmail()))&&(value.getSenha().equals(anonimo.getSenha()))) {
                        Toast.makeText(getApplicationContext(), "Bem Vindo", Toast.LENGTH_SHORT).show();
                        controle = false;
                        database = FirebaseDatabase.getInstance().getReference();
                        //intent.putExtra("anonimo",  value);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Usuário ou senha incorretos 1", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Usuário ou senha incorretos 2", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });
        if(!controle){
            final Intent intent2 = new Intent(this, Guest2.class);
            final Ajudante ajudante = new Ajudante(email, senha);
            database = FirebaseDatabase.getInstance().getReference("Ajudante/" + ajudante.getEmail());
            database.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Ajudante value = dataSnapshot.getValue(Ajudante.class);
                    try {
                        if ((value.getEmail().equals(ajudante.getEmail()))&&(value.getSenha().equals(ajudante.getSenha()))) {
                            Toast.makeText(getApplicationContext(), "Bem Vindo", Toast.LENGTH_SHORT).show();
                            controle = false;
                            database = FirebaseDatabase.getInstance().getReference();
                            //intent.putExtra("anonimo",  value);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(getApplicationContext(), "Usuário ou senha incorretos 1", Toast.LENGTH_SHORT).show();
                        }
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Usuário ou senha incorretos 2", Toast.LENGTH_SHORT).show();
                    }
                }
                @Override
                public void onCancelled(DatabaseError error) {
                    // Failed to read value
                }
            });
        }
    }
}
