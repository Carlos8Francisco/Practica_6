package com.example.actividad_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView,listView2,listView3,listView4,listView5,listView6,listView7,listView8,listView9;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exit=(Button)findViewById(R.id.crr1);
        //Listas
        listView=(ListView) findViewById(R.id.listap);
        listView2=(ListView) findViewById(R.id.listap2);
        listView3=(ListView) findViewById(R.id.listap3);
        listView4=(ListView) findViewById(R.id.listap4);
        listView5=(ListView) findViewById(R.id.listap5);
        listView6=(ListView) findViewById(R.id.listap6);
        listView7=(ListView) findViewById(R.id.listap7);
        listView8=(ListView) findViewById(R.id.listap8);
        listView9=(ListView) findViewById(R.id.listap9);
        //Strings con names de planetas - datos
        String[] nombres = {"Sol"};
        String[] nombres2 = {"Mercurio"};
        String[] nombres3 = {"Venus"};
        String[] nombres4 = {"Tierra"};
        String[] nombres5 = {"Marte"};
        String[] nombres6 = {"Júpiter"};
        String[] nombres7 = {"Saturno"};
        String[] nombres8 = {"Urano"};
        String[] nombres9 = {"Neptuno"};
        String[] dest = {"El Sol, el Rey del Astro"};
        String[] dest2 = {"El mensajero de los dioses"};
        String[] dest3 = {"El Lucero del Alba"};
        String[] dest4 = {"El planeta de la vida"};
        String[] dest5 = {"El planeta de la guerra"};
        String[] dest6 = {"El gigante gaseoso"};
        String[] dest7 = {"El planeta de los anillos"};
        String[] dest8 = {"El gigante de hielo"};
        String[] dest9 = {"El planeta del color del mar"};
        Integer[] idimagenes = {R.drawable.sol};
        Integer[] idimagenes2 = {R.drawable.mercurio};
        Integer[] idimagenes3 = {R.drawable.venus};
        Integer[] idimagenes4 = {R.drawable.tierra};
        Integer[] idimagenes5 = {R.drawable.marte};
        Integer[] idimagenes6 = {R.drawable.jupiter};
        Integer[] idimagenes7 = {R.drawable.saturno};
        Integer[] idimagenes8 = {R.drawable.urano};
        Integer[] idimagenes9 = {R.drawable.neptuno};
        AdapterListPlanet adaptador = new AdapterListPlanet(this,nombres,dest,idimagenes);
        listView.setAdapter(adaptador);
        AdapterListPlanet2 adaptador2 = new AdapterListPlanet2(this,nombres2,dest2,idimagenes2);
        listView2.setAdapter(adaptador2);
        AdapterListPlanet3 adaptador3 = new AdapterListPlanet3(this,nombres3,dest3,idimagenes3);
        listView3.setAdapter(adaptador3);
        AdapterListPlanet4 adaptador4 = new AdapterListPlanet4(this,nombres4,dest4,idimagenes4);
        listView4.setAdapter(adaptador4);
        AdapterListPlanet5 adaptador5 = new AdapterListPlanet5(this,nombres5,dest5,idimagenes5);
        listView5.setAdapter(adaptador5);
        AdapterListPlanet6 adaptador6 = new AdapterListPlanet6(this,nombres6,dest6,idimagenes6);
        listView6.setAdapter(adaptador6);
        AdapterListPlanet7 adaptador7 = new AdapterListPlanet7(this,nombres7,dest7,idimagenes7);
        listView7.setAdapter(adaptador7);
        AdapterListPlanet8 adaptador8 = new AdapterListPlanet8(this,nombres8,dest8,idimagenes8);
        listView8.setAdapter(adaptador8);
        AdapterListPlanet9 adaptador9 = new AdapterListPlanet9(this,nombres9,dest9,idimagenes9);
        listView9.setAdapter(adaptador9);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                startActivity(new Intent(MainActivity.this,menu1.class));
                Toast.makeText(getApplicationContext(),"Seleccionaste: "+nombres[i],Toast.LENGTH_LONG).show();

            }
        });

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                startActivity(new Intent(MainActivity.this,menu2.class));
                Toast.makeText(getApplicationContext(),"Seleccionaste: "+nombres2[i],Toast.LENGTH_LONG).show();

            }
        });

        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                startActivity(new Intent(MainActivity.this,menu3.class));
                Toast.makeText(getApplicationContext(),"Seleccionaste: "+nombres3[i],Toast.LENGTH_LONG).show();

            }
        });

        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                startActivity(new Intent(MainActivity.this,menu4.class));
                Toast.makeText(getApplicationContext(),"Seleccionaste: "+nombres4[i],Toast.LENGTH_LONG).show();

            }
        });

        listView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                startActivity(new Intent(MainActivity.this,menu5.class));
                Toast.makeText(getApplicationContext(),"Seleccionaste: "+nombres5[i],Toast.LENGTH_LONG).show();

            }
        });

        listView6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                startActivity(new Intent(MainActivity.this,menu6.class));
                Toast.makeText(getApplicationContext(),"Seleccionaste: "+nombres6[i],Toast.LENGTH_LONG).show();

            }
        });

        listView7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                startActivity(new Intent(MainActivity.this,menu7.class));
                Toast.makeText(getApplicationContext(),"Seleccionaste: "+nombres7[i],Toast.LENGTH_LONG).show();

            }
        });

        listView8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                startActivity(new Intent(MainActivity.this,menu8.class));
                Toast.makeText(getApplicationContext(),"Seleccionaste: "+nombres8[i],Toast.LENGTH_LONG).show();

            }
        });

        listView9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                startActivity(new Intent(MainActivity.this,menu9.class));
                Toast.makeText(getApplicationContext(),"Seleccionaste: "+nombres9[i],Toast.LENGTH_LONG).show();

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(MainActivity.this, exit.class));


            }
        });



    }
}