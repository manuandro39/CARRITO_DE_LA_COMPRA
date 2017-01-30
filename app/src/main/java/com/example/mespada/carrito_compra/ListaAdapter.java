package com.example.mespada.carrito_compra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by maquillalo on 30/01/2017.
 */

public class ListaAdapter extends BaseAdapter {

    private Context context;
    private String[] nombre;
    private String[] descripcion;
    private int id_layout_celda;
    private Integer[] arrayImages;

    public ListaAdapter(Context context, String[] nombre, String[] descripcion, Integer[] arrayImages, int id_layout_celda) {
        this.context = context;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id_layout_celda = id_layout_celda;
        this.arrayImages = arrayImages;
    }

    @Override
    public int getCount() {
        return nombre.length;
    }

    @Override
    public Object getItem(int pos) {
        return null;
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        View cv = convertView;

        if(cv == null){  //Se infla la vista si es la primera vez que se va a mostrar
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            cv = layoutInflater.inflate(id_layout_celda, null);
        }

        //Creamos variables con los datos que hay que mostrar
        String nombres = nombre[pos];
        String desc = descripcion[pos];
        Integer images = arrayImages[pos];

        //Creamos los objetos textView e ImageView del XML fila
        TextView tv_nomArt = (TextView) cv.findViewById(R.id.txtNombreArticulo);
        TextView tv_descArt = (TextView) cv.findViewById(R.id.txtDescArticulo);
        ImageView iv_img = (ImageView) cv.findViewById(R.id.image);

        //Rellenamos con la información a mostrar en cada fila del ListView
        tv_nomArt.setText(nombres);
        tv_descArt.setText(desc);
        iv_img.setImageResource(images);

        return cv;
    }
}


