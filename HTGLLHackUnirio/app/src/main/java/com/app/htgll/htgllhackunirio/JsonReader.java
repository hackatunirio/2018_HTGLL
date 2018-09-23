package com.app.htgll.htgllhackunirio;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.*;
//import org.json.simple.parser.JsonParser;
//import com.google.gson.JsonSyntaxException;

public class JsonReader {

    public static String jsonLeitor(String tema){

        String link = "http://sistemas.unirio.br/api/"+ tema +"?API_KEY=94ebdcee824a8fc9876c4c0b22580540a8d2330da2ec089d2e396afce2ee20332383a2df43936763358021ef9d163a21";
        String palavra ="";

        try{

            URL url = new URL(link);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            InputStreamReader isr = new InputStreamReader(request.getInputStream(),"UTF-8");
            char l;
            int in;

            while( (in = isr.read()) != -1 ){
                l = (char) in;
                palavra += l;
            }

        }catch(Exception e){



        }

        return palavra;
    }
}
