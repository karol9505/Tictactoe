package com.toe.tictac.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    ImageButton play, multi;
    TextView uni, mul;

    public final static String EXTRA_MESSAGE = "com.toe.tictac.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (ImageButton) findViewById(R.id.play);
        play.setOnClickListener(this);

        multi = (ImageButton) findViewById(R.id.multi);
        multi.setOnClickListener(this);

        uni= (TextView)findViewById(R.id.uni);
        mul=(TextView)findViewById(R.id.mul);
    }


    @Override
    public void onClick(View v) {
        int seleccion = v.getId();
        try {
            switch (seleccion) {
                case R.id.play:
                    Intent intent = new Intent(this, Juego.class);
                    String message = uni.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                    break;
                case R.id.multi:
                    Intent intento = new Intent(this, Juego.class);
                    String mensaje= mul.getText().toString();
                    intento.putExtra(EXTRA_MESSAGE, mensaje);
                    startActivity(intento);
                    break;
            }
        } catch (Exception e) {

        }
    }
}
