package com.tesji.spinner;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.tesji.spinner.Model.MainActivityModel;

public class MainActivity extends AppCompatActivity {

    private Spinner spCarreras;
    private AppCompatButton btCarreras;
    private TextView tvimprimir;

    private MediaPlayer buttonSound;

    String [] opCarreras = {
            "--Selecciona Carrera--",
            "ing. industrial",
            "ing Sistemas Computacionales",
            "ing Civil",
            "ing Logistica",
            "ing Mecatronica",
            "ing TICS",
            "ing Quimica",
            "Lic Administracion",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        spCarreras = findViewById(R.id.spinnerCarreras);
        ArrayAdapter<String>adapCarreras = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opCarreras);
        spCarreras.setAdapter(adapCarreras);
        tvimprimir = findViewById(R.id.textviewimprimir);
        btCarreras = findViewById(R.id.buttonVerCarreras);

        btCarreras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonSound= MediaPlayer.create(getApplicationContext(),R.raw.sonidoseleccion);
                buttonSound.start();
                MainActivityModel carrera = new MainActivityModel();
                carrera.setCarrera(spCarreras.getSelectedItemPosition());
                tvimprimir.setText(carrera.mostrarInfo());
            }
        });
        spCarreras.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                MainActivityModel cerrera = new MainActivityModel();
                cerrera.setCarrera(spCarreras.getSelectedItemPosition());
                tvimprimir.setText(cerrera.mostrarInfo());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}