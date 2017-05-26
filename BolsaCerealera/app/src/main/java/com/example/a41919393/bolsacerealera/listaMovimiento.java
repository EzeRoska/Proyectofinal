package com.example.a41919393.bolsacerealera;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class listaMovimiento extends Fragment {

    public listaMovimiento() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout.layout.fragment_lista_movimiento, container, false);


            ListView listamov;

            listamov = (ListView) findViewById(R.id.listamov);

            ArrayList<listaMovimiento> movimientos;
            movimientos = new ArrayList<>();

            MovimientosPersonas adapter = new MovimientosAdapter(this, movimientos);
            listamov.setAdapter(adapter);



                public MovimientosAdapter(Context context, ArrayList<movimiento> movimientos) {
                    this.context = context;
                    this.movimientos = movimientos;
                }
            }

    public class MovimientosAdapter extends BaseAdapter {
        ArrayList<Movimiento> movimientos;
        Context context;











    }



}


