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

public class AdapterListPlanet7 extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] nombres7;
    private final String[] des7;
    private final Integer[] id_images7;

    public AdapterListPlanet7(Activity context, String[] nombres7, String[] des7, Integer[] id_images7) {
        super(context,R.layout.item2,nombres7);
        this.context = context;
        this.nombres7 = nombres7;
        this.des7 = des7;
        this.id_images7 = id_images7;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item2,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.plnt2);
        TextView _precio = (TextView) itemView.findViewById(R.id.desp2);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo2);
        _nombre.setText(nombres7[position]);
        _precio.setText(des7[position]);
        _imagen.setImageResource(id_images7[position]);
        return itemView;
    }
}
