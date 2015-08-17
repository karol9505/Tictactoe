package com.toe.tictac.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;


public class Juego extends AppCompatActivity implements OnClickListener {

    TextView mensajeNuevo, player;
    ImageButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve;
    int contador = -1;
    Random randomGenerator = new Random();
    String message;
    boolean one = false;
    boolean two = false;
    boolean three = false;
    boolean four = false;
    boolean five = false;
    boolean six = false;
    boolean seven = false;
    boolean eight = false;
    boolean nine = false;

    public final static String EXTRA_MESSAGE = "com.toe.tictac.MESSAGE";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_juego);
        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        mensajeNuevo = (TextView) findViewById(R.id.mensajeNuevo);
        mensajeNuevo.setText(message);


        player = (TextView) findViewById(R.id.player);


        uno = (ImageButton) findViewById(R.id.uno);
        uno.setOnClickListener(this);

        dos = (ImageButton) findViewById(R.id.dos);
        dos.setOnClickListener(this);

        tres = (ImageButton) findViewById(R.id.tres);
        tres.setOnClickListener(this);

        cuatro = (ImageButton) findViewById(R.id.cuatro);
        cuatro.setOnClickListener(this);

        cinco = (ImageButton) findViewById(R.id.cinco);
        cinco.setOnClickListener(this);

        seis = (ImageButton) findViewById(R.id.seis);
        seis.setOnClickListener(this);

        siete = (ImageButton) findViewById(R.id.siete);
        siete.setOnClickListener(this);

        ocho = (ImageButton) findViewById(R.id.ocho);
        ocho.setOnClickListener(this);

        nueve = (ImageButton) findViewById(R.id.nueve);
        nueve.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int seleccion = v.getId();

        if (message.contains("Multiplayer")) {
            //validarPartida();
            contador++;
            if (contador % 2 == 0 || contador == 0) {
                player.setText("Jugador 2");

                switch (seleccion) {
                    case R.id.uno:
                        if (!one) {
                            uno.setBackgroundResource(R.drawable.cd_xxhdpi);
                        }else{
                            contador = contador-1;
                        }
                        one = true;
                        break;

                    case R.id.dos:
                        if (!two) {
                            dos.setBackgroundResource(R.drawable.cd_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        two = true;
                        break;

                    case R.id.tres:
                        if (!three) {
                            tres.setBackgroundResource(R.drawable.cd_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        three = true;
                        break;

                    case R.id.cuatro:
                        if (!four) {
                            cuatro.setBackgroundResource(R.drawable.cd_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        four = true;
                        break;

                    case R.id.cinco:
                        if (!five) {
                            cinco.setBackgroundResource(R.drawable.cd_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        five = true;
                        break;

                    case R.id.seis:
                        if (!six) {
                            seis.setBackgroundResource(R.drawable.cd_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        six = true;
                        break;

                    case R.id.siete:
                        if (!seven) {
                            siete.setBackgroundResource(R.drawable.cd_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        seven = true;
                        break;

                    case R.id.ocho:
                        if (!eight) {
                            ocho.setBackgroundResource(R.drawable.cd_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        eight = true;
                        break;

                    case R.id.nueve:
                        if (!nine) {
                            nueve.setBackgroundResource(R.drawable.cd_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        nine = true;
                        break;
                }


            } else {
                player.setText("Jugador 1");

                switch (seleccion) {
                    case R.id.uno:
                        if (!one) {
                            uno.setBackgroundResource(R.drawable.iphone_xxhdpi);
                        }else{
                            contador = contador-1;
                        }
                        one = true;
                        break;

                    case R.id.dos:
                        if (!two) {
                            dos.setBackgroundResource(R.drawable.iphone_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        two = true;
                        break;

                    case R.id.tres:
                        if (!three) {
                            tres.setBackgroundResource(R.drawable.iphone_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        three = true;
                        break;

                    case R.id.cuatro:
                        if (!four) {
                            cuatro.setBackgroundResource(R.drawable.iphone_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        four = true;
                        break;

                    case R.id.cinco:
                        if (!five) {
                            cinco.setBackgroundResource(R.drawable.iphone_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        five = true;
                        break;

                    case R.id.seis:
                        if (!six) {
                            seis.setBackgroundResource(R.drawable.iphone_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        six = true;
                        break;

                    case R.id.siete:
                        if (!seven) {
                            siete.setBackgroundResource(R.drawable.iphone_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        seven = true;
                        break;

                    case R.id.ocho:
                        if (!eight) {
                            ocho.setBackgroundResource(R.drawable.iphone_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        eight = true;
                        break;

                    case R.id.nueve:
                        if (!nine) {
                            nueve.setBackgroundResource(R.drawable.iphone_xxhdpi);
                        }else{
                            contador=contador-1;
                        }
                        nine = true;
                        break;
                }
            }
        }//cierre del if del multiplayer
    } //cierre del on click


/* Lo intentamos hacer de esta forma A PIE porque con matrices jum ni idea ojala te sirva
    public void validarPartida() {

        if(one && two && three && contador % 2 == 0){
            System.out.println("YUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU"+contador);
            Intent intent = new Intent(this, Ganaste.class);
            String message = player.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }else if(four && five && six && contador % 2 == 0){

        }else if(seven && eight && nine && contador % 2 == 0){

        }else if(one && four && seven && contador % 2 == 0){

        }else if(two && five && eight && contador % 2 == 0){

        }else if(three && six && nine && contador % 2 == 0){

        }else if(one && five && nine && contador % 2 == 0){

        }else if(three && five && seven && contador % 2 == 0){

        }
    } */
}
