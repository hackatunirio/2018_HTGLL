package com.app.htgll.htgllhackunirio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Projetos extends AppCompatActivity {

    ArrayList a = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projetos);

        String aux = JsonReader.jsonLeitor("V_PROJETOS_EXTENSAO");


    }
}
