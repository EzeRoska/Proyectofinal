package com.example.a41919393.bolsacerealera;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class PantallainicioFragment extends Fragment implements View.OnClickListener {



    MainActivity mainActivity;

    public PantallainicioFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = (MainActivity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_pantallainicio, container, false);

        Button cotiz = (Button)v.findViewById(R.id.btnCotizaciones);
        Button Lmov = (Button)v.findViewById(R.id.btnMovimiento);
        Button Mibol = (Button)v.findViewById(R.id.btnMiBolsillo);
        Button Notic = (Button)v.findViewById(R.id.btnNoticias);

        cotiz.setOnClickListener(this);
        Lmov.setOnClickListener(this);
        Mibol.setOnClickListener(this);
        Notic.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnCotizaciones:
                CotizacionesFragment cf = new CotizacionesFragment();
                mainActivity.changeFragment(cf);
            break;
            case R.id.btnMovimiento:
                listaMovimiento Lm= new listaMovimiento();
                mainActivity.changeFragment(Lm);
                break;
            case R.id.btnMiBolsillo:
                MiBolsilloFrag mbf= new MiBolsilloFrag();
                mainActivity.changeFragment(mbf);
                break;
            case R.id.btnNoticias:
                NoticiasFragment nf = new NoticiasFragment();
                mainActivity.changeFragment(nf);
                break;

        }

    }
}
