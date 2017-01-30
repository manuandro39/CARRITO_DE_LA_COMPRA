package com.example.mespada.carrito_compra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer [] arrayImages = new Integer[] {
                R.drawable.acelgas,
                R.drawable.aguacate,
                R.drawable.arroz,
                R.drawable.azucar,
                R.drawable.champinon,
                R.drawable.chocolate,
                R.drawable.colacao,
                R.drawable.cuaderno,
                R.drawable.freson,
                R.drawable.jamon,
                R.drawable.lejia,
                R.drawable.libros,
                R.drawable.manzanas,
                R.drawable.pan,
                R.drawable.pantalones,
                R.drawable.peras,
                R.drawable.planta,
                R.drawable.platanos,
                R.drawable.queso,
                R.drawable.rodaballo
        };

        String [] arrayNombres = new String[] {
                this.getResources().getString(R.string.acelgas),
                this.getResources().getString(R.string.aguacate),
                this.getResources().getString(R.string.arroz),
                this.getResources().getString(R.string.azucar),
                this.getResources().getString(R.string.champinon),
                this.getResources().getString(R.string.chocolate),
                this.getResources().getString(R.string.colacao),
                this.getResources().getString(R.string.cuaderno),
                this.getResources().getString(R.string.freson),
                this.getResources().getString(R.string.jamon),
                this.getResources().getString(R.string.lejia),
                this.getResources().getString(R.string.libros),
                this.getResources().getString(R.string.manzanas),
                this.getResources().getString(R.string.pan),
                this.getResources().getString(R.string.pantalones),
                this.getResources().getString(R.string.peras),
                this.getResources().getString(R.string.planta),
                this.getResources().getString(R.string.platanos),
                this.getResources().getString(R.string.queso),
                this.getResources().getString(R.string.rodaballo)
        };

        String [] arrayDesc = new String[] {
                this.getResources().getString(R.string.descacelgas),
                this.getResources().getString(R.string.descaguacate),
                this.getResources().getString(R.string.descarroz),
                this.getResources().getString(R.string.descazucar),
                this.getResources().getString(R.string.descchampinon),
                this.getResources().getString(R.string.descchocolate),
                this.getResources().getString(R.string.desccolacao),
                this.getResources().getString(R.string.desccuaderno),
                this.getResources().getString(R.string.descfreson),
                this.getResources().getString(R.string.descjamon),
                this.getResources().getString(R.string.desclejia),
                this.getResources().getString(R.string.desclibros),
                this.getResources().getString(R.string.descmanzanas),
                this.getResources().getString(R.string.descpan),
                this.getResources().getString(R.string.descpantalones),
                this.getResources().getString(R.string.descperas),
                this.getResources().getString(R.string.descplanta),
                this.getResources().getString(R.string.descplatanos),
                this.getResources().getString(R.string.descqueso),
                this.getResources().getString(R.string.descrodaballo)
        };


        //Llamada a la clase ListaAdapter con la que podamos inflar la vista que muestre la tabla de valores
        //valiéndonos de las filas de datos del layout "fila_listado"
        ListAdapter adapter = new ListaAdapter (this, arrayNombres, arrayDesc, arrayImages, R.layout.fila);

        //Asociar el Adapter a la vista

        final ListView listview = (ListView) findViewById(R.id.listaCompra);
        listview.setAdapter(adapter);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuItem seleccion = menu.add(Menu.NONE, Menu.FIRST, Menu.NONE, "Ver Selección");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}
