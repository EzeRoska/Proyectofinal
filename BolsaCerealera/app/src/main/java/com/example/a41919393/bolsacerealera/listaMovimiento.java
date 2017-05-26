package com.example.a41919393.bolsacerealera;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        View v= inflater.inflate(R.layout.layout.layout.fragment_lista_movimiento, container, false);


            ListView listamov;

            listamov = (ListView) v.findViewById(R.id.listamov);

            ArrayList<Movimiento> movimientos;
            movimientos = new ArrayList<>();

             MovimientosAdapter adapter = new MovimientosAdapter(getContext(), movimientos);
            listamov.setAdapter(adapter);




        return v;
            }













    }



}


