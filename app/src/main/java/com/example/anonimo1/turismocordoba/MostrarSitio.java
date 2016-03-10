package com.example.anonimo1.turismocordoba;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by anonimo1 on 26/02/2016.
 */
public class MostrarSitio extends Activity{

    private TextView title;
    private ImageView image;
    private TextView description;
    private TextView history;
    private Sitio sitio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_sitio);

        title = (TextView) findViewById(R.id.tvTitle);
        image = (ImageView) findViewById(R.id.imgView);
        description = (TextView) findViewById(R.id.tvDescription);
        history = (TextView) findViewById(R.id.tvHistory);

        sitio = (Sitio)getIntent().getExtras().getSerializable("SITIO");
        title.setText(sitio.getTitulo());
        image.setImageResource(sitio.getImagen());
        description.setText(sitio.getDescripcion());
        description.setText(sitio.getDescripcion());
        history.setText(sitio.getHistoria());
    }


}
