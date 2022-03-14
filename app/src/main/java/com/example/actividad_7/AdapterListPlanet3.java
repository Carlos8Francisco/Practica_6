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

public class AdapterListPlanet3 extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] nombres3;
    private final String[] des3;
    private final Integer[] id_images3;

    public AdapterListPlanet3(Activity context, String[] nombres3, String[] des3, Integer[] id_images3) {
        super(context,R.layout.item2,nombres3);
        this.context = context;
        this.nombres3 = nombres3;
        this.des3 = des3;
        this.id_images3 = id_images3;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item2,null);
        TextView _nombre = (TextView) itemView.findViewById(R.id.plnt2);
        TextView _precio = (TextView) itemView.findViewById(R.id.desp2);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo2);
        _nombre.setText(nombres3[position]);
        _precio.setText(des3[position]);
        _imagen.setImageResource(id_images3[position]);
        return itemView;
    }
}
