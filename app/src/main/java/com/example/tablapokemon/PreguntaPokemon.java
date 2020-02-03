package com.example.tablapokemon;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.print.PrinterId;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static com.example.tablapokemon.listaPokemons.listapokemons;

public class PreguntaPokemon extends AppCompatActivity {

    private Button btn_terminar, btn_comprueba;
    private ImageView imagenSombra;
    private TextView puntos;
    private int nPuntos = 0;
    private TextView puntosMax;
    private static int nPuntosMax = 0;
    private EditText cualPokemon;
    private cPokemon pokemon;

    public ArrayList<cPokemon> listaPreguntas = new ArrayList<cPokemon>();
    private int imgRandom;
    private int pos;
    private String pokemonNegro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta_pokemon);

        btn_terminar = findViewById(R.id.btn_terminar);
        btn_terminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        listaPreguntas = listaPokemons.listapokemons;

        cogerImagenSombra(listaPreguntas);

        puntos = findViewById(R.id.text_puntos);
        puntosMax = findViewById(R.id.text_puntos_max);


        imagenSombra = (ImageView) findViewById(R.id.imgSombra);
        cualPokemon = findViewById(R.id.text_pokemon);

        btn_comprueba = findViewById(R.id.btn_comprueba);
        btn_comprueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pokemonEscrito = cualPokemon.getText().toString().toLowerCase();

//TODO: Falta rellenar pokedex con la info
//TODO: Arreglar el random

                    if (pokemonNegro.equals(pokemonEscrito)) {
                        nPuntos++;
                        puntos.setText(String.valueOf(nPuntos));
                        Toast.makeText(PreguntaPokemon.this, "CORRECTO", Toast.LENGTH_LONG).show();
                        cualPokemon.setText("");
                        cogerImagenSombra(listaPreguntas);

                    } else if (pokemonEscrito.isEmpty()) {
                        Toast.makeText(PreguntaPokemon.this, "PON ALGO, QUE ESTA EN BLANCO!!!", Toast.LENGTH_LONG).show();
                        cualPokemon.setText("");

                    } else {
                        nPuntosMax++;
                        puntosMax.setText(String.valueOf(nPuntosMax));
                        Toast.makeText(PreguntaPokemon.this, "INCORRECTO", Toast.LENGTH_LONG).show();
                        cualPokemon.setText("");
                        cogerImagenSombra(listaPreguntas);
                    }
            }
        });
    }
    public void cogerImagenSombra(ArrayList<cPokemon> pokemon) {

        imagenSombra = (ImageView) findViewById(R.id.imgSombra);

        //pos = randomNoRepe();
        Collections.shuffle(listaPreguntas);

        String nombre = pokemon.get(pos).getNombre();
        pokemonNegro = nombre.toLowerCase();
        //String nombre = "Treeco";

        String src = "@drawable/s" + nombre;
        src = src.toLowerCase();

        imagenSombra.setImageResource(getResources().getIdentifier(src,"drawable", getOpPackageName()));
        pos++;
    }
    }

/*
        public void cogerImagenSombra(){

          int imgRandom = 0;
          int comptador = 0;
          String rutaImagenSombra ;

          while (comptador != 26) {

          imgRandom = (int) (Math.random()*25+0);
          comptador = 0;

          for (int i = 0; i < PokesUsed.length; i++){

                if (PokesUsed[i] != imgRandom) {
                    comptador++;
                }
            }
          }
                PokesUsed[properaLliurePokes] = imgRandom;
                properaLliurePokes++;
                rutaImagenSombra = listaPreguntas.get(imgRandom).getFotoSombra();
                imagenSombra.setImageResource(getResources().getIdentifier(rutaImagenSombra, "drawable", getOpPackageName()));

        }

 */

