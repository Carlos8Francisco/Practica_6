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

public class AdapterListPlanet2 extends ArrayAdapter<String>  {
    private final Activity context;
    private final String[] nombres2;
    private final String[] des2;
    private final Integer[] id_images2;

    public AdapterListPlanet2(Activity context, String[] nombres2, String[] des2, Integer[] id_images2) {
        super(context,R.layout.item2,nombres2);
        this.context = context;
        this.nombres2 = nombres2;
        this.des2 = des2;
        this.id_images2 = id_images2;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item2,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.plnt2);
        TextView _precio = (TextView) itemView.findViewById(R.id.desp2);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo2);
        _nombre.setText(nombres2[position]);
        _precio.setText(des2[position]);
        _imagen.setImageResource(id_images2[position]);
        return itemView;
    }
}
