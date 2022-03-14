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

public class AdapterListPlanet8 extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] nombres8;
    private final String[] des8;
    private final Integer[] id_images8;

    public AdapterListPlanet8(Activity context, String[] nombres8, String[] des8, Integer[] id_images8) {
        super(context,R.layout.item2,nombres8);
        this.context = context;
        this.nombres8 = nombres8;
        this.des8 = des8;
        this.id_images8 = id_images8;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item2,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.plnt2);
        TextView _precio = (TextView) itemView.findViewById(R.id.desp2);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo2);
        _nombre.setText(nombres8[position]);
        _precio.setText(des8[position]);
        _imagen.setImageResource(id_images8[position]);
        return itemView;
    }
}
