package com.grupom.pm1examen2grupo2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ActualizarContactos extends AppCompatActivity {

    Button btnAtras, btnActualizar,btnGaleria;
    FloatingActionButton btnTomarfoto;
    EditText txtNombre,txtTelefono,txtLat,txtLon;
    ImageView Foto;
    String fotoString;

    Bitmap imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_contactos);
    }
}