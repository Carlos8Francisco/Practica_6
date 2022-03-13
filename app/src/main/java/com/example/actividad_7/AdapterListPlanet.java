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
    private final String[] nombres, nombres2;
    private final String[] des, des2;
    private final Integer[] id_images,id_images2;

    public AdapterListPlanet(Activity context, String[] nombres, String[] nombres2, String[] des, String[] des2, Integer[] id_images, Integer[] id_images2) {
        super(context,R.layout.item,nombres);
        this.context = context;
        this.nombres = nombres;
        this.nombres2 = nombres2;
        this.des = des;
        this.des2 = des2;
        this.id_images = id_images;
        this.id_images2 = id_images2;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.plnt);
        TextView _nombre2 = (TextView) itemView.findViewById(R.id.plnt2);
        TextView _precio = (TextView) itemView.findViewById(R.id.desp);
        TextView _precio2 = (TextView) itemView.findViewById(R.id.desp2);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo);
        ImageView _imagen2 = (ImageView) itemView.findViewById(R.id.logo2);
        _nombre.setText(nombres[position]);
        _nombre2.setText(nombres2[position]);
        _precio.setText(des[position]);
        _precio2.setText(des2[position]);
        _imagen.setImageResource(id_images[position]);
        _imagen2.setImageResource(id_images2[position]);
        return itemView;
    }

}
