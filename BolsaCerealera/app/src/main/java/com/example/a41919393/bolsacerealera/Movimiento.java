package com.example.a41919393.bolsacerealera;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by 41919393 on 26/5/2017.
 */

public class Movimiento extends AppCompatActivity{
    float importe;



    char entrada_salida;


    public Movimiento(float importe, char entrada_salida) {
        this.importe = importe;
        this.entrada_salida = entrada_salida;
    }

    public float getImporte() {
        return importe;
    }

    public char getEntrada_salida() {
        return entrada_salida;
    }

    public void btnGuardar(View VistaR) {
        EditText fecha = (EditText) VistaR.findViewById(R.id.edFecha);
        String Fecha = fecha.getText().toString();

        EditText lote = (EditText) VistaR.findViewById(R.id.edLote);
        String Lote = fecha.getText().toString();

        EditText cantidad = (EditText) VistaR.findViewById(R.id.edCant);
        String Cantidad = fecha.getText().toString();
        Integer cant = Integer.parseInt(Cantidad);

        Spinner grano = (Spinner) VistaR.findViewById(R.id.spGrano);
        String Grano = grano.getSelectedItem().toString();

        Bundle paqueteDatos = new Bundle();
        paqueteDatos.putString("Fecha", Fecha);
        paqueteDatos.putString("Lote", Lote);
        paqueteDatos.putInt("Cantidad", cant);
        paqueteDatos.putString("Grano", Grano);
        Intent IrAFragment = new Intent(VistaR.getContext(), listaMovimiento.class);
        IrAFragment.putExtras(paqueteDatos);


        listaMovimiento lm = new listaMovimiento(amdms,dm asd,sd)
        FragmentManager fm = getFragmentManager();
        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(android.R.id.content, lm, "UN_TAG");
        tx.commit();



    }
}
