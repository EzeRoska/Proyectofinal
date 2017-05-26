package com.example.a41919393.bolsacerealera;

import android.content.Context;
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
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
