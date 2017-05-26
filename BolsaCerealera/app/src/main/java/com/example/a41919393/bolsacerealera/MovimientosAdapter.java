package com.example.a41919393.bolsacerealera;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by 41919393 on 26/5/2017.
 */

public class MovimientosAdapter extends BaseAdapter{
    Context context;
    ArrayList<Movimiento> movimientos;
    public MovimientosAdapter(Context context, ArrayList<Movimiento> movimientos) {
        this.context = context;
        this.movimientos = movimientos;
    }



    @Override
    public int getCount() {
        return movimientos.size();
    }

    @Override
    public Object getItem(int position) {
        return movimientos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position
                ;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view== null){
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item, viewGroup, false);

            TextView nombreTV = (TextView)view.findViewById(R.id.nombre);
            TextView apellidoTV = (TextView)view.findViewById(R.id.apellido);



        }


    }
}
