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

public class AdapterListPlanet4 extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] nombres4;
    private final String[] des4;
    private final Integer[] id_images4;

    public AdapterListPlanet4(Activity context, String[] nombres4, String[] des4, Integer[] id_images4) {
        super(context,R.layout.item2,nombres4);
        this.context = context;
        this.nombres4 = nombres4;
        this.des4 = des4;
        this.id_images4 = id_images4;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item2,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.plnt2);
        TextView _precio = (TextView) itemView.findViewById(R.id.desp2);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo2);
        _nombre.setText(nombres4[position]);
        _precio.setText(des4[position]);
        _imagen.setImageResource(id_images4[position]);
        return itemView;
    }
}
