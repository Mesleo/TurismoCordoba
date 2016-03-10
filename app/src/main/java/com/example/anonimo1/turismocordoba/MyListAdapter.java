package com.example.anonimo1.turismocordoba;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class MyListAdapter extends BaseAdapter {

    Intent intent;
    private Activity activity;
    private ArrayList<Sitio> sitios;

    public MyListAdapter(Activity activity, ArrayList<Sitio> sitios) {
        this.activity = activity;
        this.sitios = sitios;
    }


    @Override
    public int getCount() {
        return sitios.size();
    }

    @Override
    public Object getItem(int position) {
        return sitios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View converView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_view, null, true);

        final Sitio currentSitio = sitios.get(position);

        ImageView image = (ImageView) view.findViewById(R.id.imageView);
        image.setImageResource(currentSitio.getImagen());

        TextView tvSitio = (TextView) view.findViewById(R.id.tvSitio);
        tvSitio.setText(currentSitio.getTitulo());

        TextView tvDescripcion = (TextView) view.findViewById(R.id.tvDescripcion);
        tvDescripcion.setText(currentSitio.getDescripcion().substring(0, 50) + "...");

        final LinearLayout linearElement = (LinearLayout) view.findViewById(R.id.linearElement);
        linearElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(activity, MostrarSitio.class);
                intent.putExtra("SITIO", currentSitio);
                activity.startActivity(intent);
            }
        });

        return view;
    }

}
