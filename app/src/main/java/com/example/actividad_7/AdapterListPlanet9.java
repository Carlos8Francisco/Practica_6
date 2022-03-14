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

public class AdapterListPlanet9 extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] nombres9;
    private final String[] des9;
    private final Integer[] id_images9;

    public AdapterListPlanet9(Activity context, String[] nombres9, String[] des9, Integer[] id_images9) {
        super(context,R.layout.item2,nombres9);
        this.context = context;
        this.nombres9 = nombres9;
        this.des9 = des9;
        this.id_images9 = id_images9;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item2,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.plnt2);
        TextView _precio = (TextView) itemView.findViewById(R.id.desp2);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo2);
        _nombre.setText(nombres9[position]);
        _precio.setText(des9[position]);
        _imagen.setImageResource(id_images9[position]);
        return itemView;
    }
}
