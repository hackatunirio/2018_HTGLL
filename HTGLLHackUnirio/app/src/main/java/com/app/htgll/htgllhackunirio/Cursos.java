package com.app.htgll.htgllhackunirio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class Cursos extends AppCompatActivity {

    private String bancoDeDados = "V_EMW_CURSOS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        ArrayList<String> a = preencherArray();
        ListView l = (ListView)findViewById(R.id.listaCursos);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,a);
        l.setAdapter(arrayAdapter);
    }

    public static String [] arrayOfJson(String tema){

        String link = "http://sistemas.unirio.br/api/"+ tema +"?API_KEY=94ebdcee824a8fc9876c4c0b22580540a8d2330da2ec089d2e396afce2ee20332383a2df43936763358021ef9d163a21";
        String json ="";

        try{

            URL url = new URL(link);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            InputStreamReader isr = new InputStreamReader(request.getInputStream(),"UTF-8");
            char l;
            int in;

            while( (in = isr.read()) != -1 ){
                l = (char) in;
                json += l;
            }

        }catch(Exception e){


        }

        json = json.replace("{","");
        json = json.replace("\"","");
        json = json.replace(":","");
        String n[] = json.split("},");

        for(int i = 0; i < n.length-1; i++){

            n[i] = n[i+1].trim().replace(",", "");

        }
        n[n.length -1] = "";
        return n;

    }

    private ArrayList<String> preencherArray(){

        ArrayList<String> a = new ArrayList<String>();
        String s[] = arrayOfJson(bancoDeDados);

        for(int i = 0; i < s.length; i++){
            String b = s[i]+": "+s[++i];
            a.add(b);
        }

        return a;
    }

}
