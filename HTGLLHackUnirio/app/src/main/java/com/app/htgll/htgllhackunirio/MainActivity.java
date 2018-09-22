package com.app.htgll.htgllhackunirio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView assistente = (CardView) findViewById(R.id.assistente);
        CardView projetos = (CardView)findViewById(R.id.projetos);
        CardView cursos = (CardView)findViewById(R.id.cursos);
        CardView eventos = (CardView)findViewById(R.id.eventos);

        assistente.setOnClickListener(this);
        projetos.setOnClickListener(this);
        cursos.setOnClickListener(this);
        eventos.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.assistente: i = new Intent(this, AssistenteSocial.class); startActivity(i); break;
            case R.id.projetos: i = new Intent(this, Projetos.class); startActivity(i); break;
            case R.id.cursos: i = new Intent(this, Cursos.class); startActivity(i); break;
            case R.id.eventos: i = new Intent(this, Eventos.class); startActivity(i); break;
            default:break;
        }
    }
}
