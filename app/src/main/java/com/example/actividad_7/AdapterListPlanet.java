package com.example.actividad_7;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterListPlanet extends ArrayAdapter<String>  {
    private final Activity context;
    private final String[] nombres;
    private final String[] des;
    private final Integer[] id_images;


    public AdapterListPlanet(Activity context, String[] nombres, String[] des, Integer[] id_images) {
        super(context,R.layout.item,nombres);
        this.context = context;
        this.nombres = nombres;
        this.des = des;
        this.id_images = id_images;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.plnt);
        TextView _precio = (TextView) itemView.findViewById(R.id.desp);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo);
        _nombre.setText(nombres[position]);
        _precio.setText(des[position]);
        _imagen.setImageResource(id_images[position]);
        return itemView;
    }

}
