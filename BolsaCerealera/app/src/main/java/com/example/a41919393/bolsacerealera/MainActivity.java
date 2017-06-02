package com.example.a41919393.bolsacerealera;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pantallainicio p = new Pantallainicio();
        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(android.R.id.content, p, "UN_TAG");
        tx.commit();

    }

}
