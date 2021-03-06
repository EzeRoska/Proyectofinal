package com.example.a42200543.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by 42200543 on 11/5/2017.
 */

public class Basededatos extends SQLiteOpenHelper {

    public  Basededatos(Context contexto, String nombre, SQLiteDatabase.CursorFactory fabrica, int Version){
        super(contexto,nombre,fabrica,Version);
    }
        @Override
        public void onCreate(SQLiteDatabase baseDeDatos)
        {
            Log.d("SQLite","Declaro e inicializo la variable para crear la tabla Login");
            String sqlCrearTablaLogin;
            sqlCrearTablaLogin="create table Login(Usuario text,Contraseña text)";

            Log.d("SQLite","invoca al creador de la tabla");
            baseDeDatos.execSQL(sqlCrearTablaLogin);
            Log.d("SQLite"," fin de la creacion de la tabla Login");

            Log.d("SQLite","Declaro e inicializo la variable para crear la tabla MovimientoFragment");
            String sqlCrearTablaMovimiento;
            sqlCrearTablaMovimiento=" create table MovimientoFragment(Id integer, Fecha integer, Grano text,Medicion boolean,Entrada integer, Salida integer)";

            Log.d("SQLite","invoca al creador de la tabla");
            baseDeDatos.execSQL(sqlCrearTablaMovimiento);
            Log.d("SQLite"," fin de la creacion de la tabla MovimientoFragment");

            Log.d("SQLite","Declaro e inicializo la variable para crear la tabla Cotizaciones");
            String sqlCrearTablaCotizaciones;
            sqlCrearTablaCotizaciones=" create table Cotizaciones(Id integer, Fecha integer, Importe integer,Tipo boolean)";

            Log.d("SQLite","invoca al creador de la tabla");
            baseDeDatos.execSQL(sqlCrearTablaCotizaciones);
            Log.d("SQLite"," fin de la creacion de la tabla Cotizaciones");

            Log.d("SQLite","Declaro e inicializo la variable para crear la tabla Mi Bolsillo");
            String sqlCrearTablaMiBolsillo;
            sqlCrearTablaMiBolsillo="create table MiBolsillo(Id integer, Trigo integer,Cebada integer, Maiz integer,Soja integer,ConImpuesto integer, SinImpuesto integer)";

            Log.d("SQLite","invoca al creador de la tabla");
            baseDeDatos.execSQL(sqlCrearTablaMiBolsillo);
            Log.d("SQLite"," fin de la creacion de la tabla MiBolsillo");


        }
        @Override
        public void onUpgrade(SQLiteDatabase baseDeDatos, int versionAnterior, int versionNueva)
        {
            Log.d("SQLite"," on upgrade");
        }
}
