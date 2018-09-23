package com.app.htgll.htgllhackunirio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = (EditText)findViewById(R.id.input);
                TextView mensagem = (TextView)findViewById(R.id.mensagemMocada);
                mensagem.setText(input.getText().toString());
                //verifucar o gerEmail
                //FirebaseDatabase.getInstance().getReference().push().setValue(new Mensagem(inpuit.getText().toString(),
                //      FirebaseAuth.getInstance().getCurrentUser().getEmail()));
                //inpuit.setText("");
                //displayChatMessage();
            }
        });

        
    }
}
