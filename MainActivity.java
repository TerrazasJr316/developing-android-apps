package com.tesji.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.tesji.app.Model.MainActivityModel;

public class MainActivity extends AppCompatActivity {

    //1. Declarar los views a manipular
    private TextInputEditText txNombre;
    private TextInputEditText txAnacimiento;
    public Button btEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Referenciar los views declarados con el id
        // definido en el xml (vista)

        txNombre = findViewById(R.id.txtNombre);
        txAnacimiento = findViewById(R.id.txtAnio);
        btEnviar = findViewById(R.id.btnEnviar);

        //3. Generar el evento clic para el boton
        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txNombre.getText().toString().trim().length() == 0) {
                    txNombre.setText(null);
                    txNombre.setError("Debes ingresar Nombre");
                    txNombre.requestFocus();
                } else if (txAnacimiento.getText().toString().trim().length() == 0) {
                    txAnacimiento.setText(null);
                    txAnacimiento.setError("Ingrese año de nacimiento");
                    txAnacimiento.requestFocus();
                } else {

                    /*
                    String titulo = txNombre.getText().toString().trim();
                       --al extraer el objetos es editable y no es string por eso se pone el .toString()
                    int anio = Integer.parseInt(txNombre.getText().toString());

                      -- crear el objeto
                    MainActivityModel objModel;
                    objModel = new MainActivityModel();
                    crear el objeto con los 3 pasos

                    objModel.nombre = txNombre.getText().toString().trim();
                    objModel.anioNa = Integer.parseInt(txNombre.getText().toString());


                        en ocultar los datos
                        set asigna un valor a un atributo a una clase
                        get lee un valor de atributo de una clase
                     */

                    MainActivityModel objModel = new MainActivityModel();
                    objModel.setNombre(txNombre.getText().toString().trim());
                    objModel.setAnioNa(Integer.parseInt(txAnacimiento.getText().toString()));
                    /*
                    enviando la peticon al modelo
                    recibe los datos, los precesa y los regresa a la vista
                     */
                    Toast.makeText(getApplicationContext(), objModel.calcularEdad(), Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
