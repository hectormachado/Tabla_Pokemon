package com.example.tablapokemon;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class info_pokemon extends AppCompatActivity {

    private Button buttonWiki;
    private Button compartir;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.layout_info_pokemon);



        // deshabilita el titol
        getSupportActionBar().hide();

        // deshabilita la barra de notificacions
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Bundle bundle = getIntent().getExtras();

        final TextView numero = (TextView) findViewById(R.id.numero);
        final String numero1 = bundle.getString("numero");
        numero.setText(numero1);

        final TextView tipo11 = (TextView) findViewById(R.id.tipo1);
        final String tipo1 = bundle.getString("tipo1");
        tipo11.setBackgroundColor(Color.parseColor(dimeColorTipo(tipo1)));
        tipo11.setText(tipo1);

        final TextView tipo22 = (TextView) findViewById(R.id.tipo2);
        final String tipo2 = bundle.getString("tipo2");
        tipo22.setBackgroundColor(Color.parseColor(dimeColorTipo(tipo2)));
        tipo22.setText(tipo2);

        final TextView nombre = (TextView) findViewById(R.id.nombre);
        final String nombreb = bundle.getString("nombre");
        nombre.setBackgroundColor(Color.parseColor(dimeColorTipo(tipo1)));
        nombre.setText(nombreb);

        TextView descripcion = (TextView) findViewById(R.id.descripcion);
        String descripcion1 = bundle.getString("descripcion");
        if (dimeColorTipo(tipo2) != "#00FFFFFF") {
            descripcion.setTextColor(Color.parseColor(dimeColorTipo(tipo2)));
        }else{
            descripcion.setTextColor(Color.parseColor(dimeColorTipo(tipo1)));
        }
        descripcion.setText(descripcion1);

        TextView tipopokemon = (TextView) findViewById(R.id.tipopokemon);
        String tipopokemonl = bundle.getString("tipopokemon");
        if (dimeColorTipo(tipo2) != "#00FFFFFF") {
            tipopokemon.setTextColor(Color.parseColor(dimeColorTipo(tipo2)));
        }else{
            tipopokemon.setTextColor(Color.parseColor(dimeColorTipo(tipo1)));
        }
        tipopokemon.setText(tipopokemonl);

        TextView caracteristicas = (TextView) findViewById(R.id.caracteristicas);
        caracteristicas.setBackgroundColor(Color.parseColor(dimeColorTipo(tipo1)));

        TextView altura = (TextView) findViewById(R.id.altura);
        final String altura1 = bundle.getString("altura");
        altura.setText(altura1);

        final TextView peso = (TextView) findViewById(R.id.peso);
        final String peso1 = bundle.getString("peso");
        peso.setText(peso1);

        TextView habilidad = (TextView) findViewById(R.id.habilidad);
        final String habilidad1 = bundle.getString("habilidad");
        habilidad.setText(habilidad1);

        TextView habilidad_oculto = (TextView) findViewById(R.id.habilidado);
        final String habilidad_oculto1 = bundle.getString("habilidadOculta");
        habilidad_oculto.setText(habilidad_oculto1);

        final Button url = (Button) findViewById(R.id.url);
        final String urll = bundle.getString("url");

        final ImageView foto = (ImageView) findViewById(R.id.foto);
        String src = bundle.getString("foto");
        foto.setImageResource(getResources().getIdentifier(src, "drawable", getOpPackageName()));

        buttonWiki = findViewById(R.id.url);
        compartir = findViewById(R.id.bCompartir);

        compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);

                if (habilidad_oculto1.isEmpty()) {

                    String mensaje = ""
                            + "Este pokemon se llama " + nombreb + "\n"
                            + "El numero de pokedex es " + numero1 + "\n"
                            + "Su habilidad es " + habilidad1 + "\n"
                            + "Su peso es " + peso1 + "\n"
                            + "Su altura es " + altura1 + "\n" + "\n"
                            + "Para mas informacion consulte la Pokedex " + "\n" + "\n"
                            + urll;
                    sendIntent.putExtra(Intent.EXTRA_TEXT, mensaje);
                }else {
                    String mensajeh = ""
                            + "Este pokemon se llama " + nombreb + "\n"
                            + "El numero de pokedex es " + numero1 + "\n"
                            + "Su habilidad es " + habilidad1 + "\n"
                            + "Su habilidad oculta es " + habilidad_oculto1 + "\n"
                            + "Su peso es " + peso1 + "\n"
                            + "Su altura es " + altura1 + "\n" + "\n"
                            + "Para mas informacion consulte la Pokedex " + "\n" + "\n"
                            + urll;
                    sendIntent.putExtra(Intent.EXTRA_TEXT, mensajeh);
                }
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

        buttonWiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urll));
                startActivity(intent);
            }
        });

    }

    public String dimeColorTipo(String tipo) {

        String color;

        switch (tipo) {

            case "PLANTA":
                color="#1ABB0D";
                break;
            case "VENENO":
                color="#A90DBB";
                break;
            case "FUEGO":
                color="#F05030";
                break;
            case "AGUA":
                color="#3899F8";
                break;
            case "VOLADOR":
                color="#98A8F0";
                break;
            case "ROCA":
                color="#B8A058";
                break;
            case "TIERRA":
                color="#DEC054";
                break;
            case "HADA":
                color="#E79FE7";
                break;
            case "BICHO":
                color="#A8B820";
                break;
            case "SINIESTRO":
                color="#7A5848";
                break;
            case "PSIQUICO":
                color="#F870A0";
                break;
            case "ACERO":
                color="#A8A8C0";
                break;
            case "HIELO":
                color="#58C8E0";
                break;
            case "LUCHA":
                color="#A05038";
                break;
            case "NORMAL":
                color="#A8A090";
                break;
            case "FANTASMA":
                color="#6060B0";
                break;
            case "ELECTRICO":
                color="#F8D030";
                break;
            case "DRAGON":
                color="#7860E0";
                break;

            default:
                color="#00FFFFFF";
                break;

        }
        return color;
    }
}
