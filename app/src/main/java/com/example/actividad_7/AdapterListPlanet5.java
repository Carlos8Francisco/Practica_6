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

public class AdapterListPlanet5 extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] nombres5;
    private final String[] des5;
    private final Integer[] id_images5;

    public AdapterListPlanet5(Activity context, String[] nombres5, String[] des5, Integer[] id_images5) {
        super(context,R.layout.item2,nombres5);
        this.context = context;
        this.nombres5 = nombres5;
        this.des5 = des5;
        this.id_images5 = id_images5;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item2,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.plnt2);
        TextView _precio = (TextView) itemView.findViewById(R.id.desp2);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo2);
        _nombre.setText(nombres5[position]);
        _precio.setText(des5[position]);
        _imagen.setImageResource(id_images5[position]);
        return itemView;
    }
}
