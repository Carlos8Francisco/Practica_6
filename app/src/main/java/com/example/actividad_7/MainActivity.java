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
        listView=(ListView) findViewById(R.id.listap);
        String[] nombres = {"Sol"};
        String[] nombres2 = {"Mercurio"};
        String[] dest = {"Descripción"};
        String[] dest2 = {"Descripción"};
        Integer[] idimagenes = {R.drawable.manzana};
        Integer[] idimagenes2 = {R.drawable.naranja};
        AdapterListPlanet adaptador = new AdapterListPlanet(this,nombres,nombres2,dest,dest2,idimagenes,idimagenes2);
        listView.setAdapter(adaptador);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Seleccionaste : "+nombres[i],Toast.LENGTH_LONG).show();
            }
        });

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(MainActivity.this,info1.class));
            }
        });*/

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Seleccionaste : "+dest2[i],Toast.LENGTH_LONG).show();
            }
        });

        /*listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"El costo es : "+dest[i],Toast.LENGTH_LONG).show();
                return true;
            }
        });*/

    }
}