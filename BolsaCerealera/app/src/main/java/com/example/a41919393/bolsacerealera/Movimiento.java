package com.example.a41919393.bolsacerealera;

/**
 * Created by 41919393 on 26/5/2017.
 */

public class Movimiento {
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
}
