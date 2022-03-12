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

public class AdapterListPlanet extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] planeta;
    private final String[] descrip;
    private final Integer[] id_images;

    public AdapterListPlanet(Activity context, String[] planeta, String[] descrip, Integer[] id_images) {
        super(context,R.layout.item,planeta);
        this.context = context;
        this.planeta = planeta;
        this.descrip = descrip;
        this.id_images = id_images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View itemView = inflater.inflate(R.layout.item, null);
        TextView _planeta = (TextView) itemView.findViewById(R.id.planeta);
        TextView _descrip = (TextView) itemView.findViewById(R.id.descrip);
        ImageView _imagen = (ImageView) itemView.findViewById(R.id.logo);
        _planeta.setText(planeta[position]);
        _descrip.setText(descrip[position]);
        _imagen.setImageResource(id_images[position]);
        return itemView;
    }
}
