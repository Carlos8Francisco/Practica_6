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

public class AdapterListPlanet6 extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] nombres6;
    private final String[] des6;
    private final Integer[] id_images6;

    public AdapterListPlanet6(Activity context, String[] nombres6, String[] des6, Integer[] id_images6) {
        super(context,R.layout.item2,nombres6);
        this.context = context;
        this.nombres6 = nombres6;
        this.des6 = des6;
        this.id_images6 = id_images6;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item2,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.plnt2);
        TextView _precio = (TextView) itemView.findViewById(R.id.desp2);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo2);
        _nombre.setText(nombres6[position]);
        _precio.setText(des6[position]);
        _imagen.setImageResource(id_images6[position]);
        return itemView;
    }
}
