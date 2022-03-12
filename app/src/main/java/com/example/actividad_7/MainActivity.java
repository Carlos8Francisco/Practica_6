package com.example.actividad_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listaplanet);
        String[] planeta = {"Sol", "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno"};
        String[] descrip = {"descripción"};
        Integer[] idimagenes = {R.drawable.sol,R.drawable.mercurio, R.drawable.venus, R.drawable.tierra, R.drawable.marte, R.drawable.jupiter, R.drawable.saturno, R.drawable.urano, R.drawable.neptuno};
        AdapterListPlanet adaptator = new AdapterListPlanet(this,planeta, descrip, idimagenes);
        listView.setAdapter(adaptator);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Seleccionaste : "+planeta[i],Toast.LENGTH_LONG).show();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"La descripcion es : "+descrip[i],Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, menu1.class));
                return true;
            }
        });




    }
}