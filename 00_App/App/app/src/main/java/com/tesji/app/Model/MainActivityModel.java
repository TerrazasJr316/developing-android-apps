package com.tesji.app.Model;

import android.icu.util.Calendar;

public class MainActivityModel {

    //En estructura de Datos es mi TDA
    //TDA = Datos + Operaciones

    //Definiendo Datos
    private String Nombre;
    private int AnioNa;

    Calendar cal = Calendar.getInstance();

    int year = cal.get(Calendar.YEAR);

    //Defininiedo Operaciones
    public String calcularEdad() {
        int edad;
        edad = year - AnioNa;
        //buscar la funcion para extraer la fecha de nacimineto en Java


            /*
            pasos para crear un objeto
                    1 se declara
                    2 se carga en memoria
                    3 se inicializa
             */
        return "Hola " + Nombre + "\nTu edad es " + edad + "años";
    }

    public String getNombre() { return Nombre; }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getAnioNa() { return AnioNa; }

    public void setAnioNa(int anioNa) {
        this.AnioNa = anioNa;
    }
        /*
          -- set para nombre
        public void setNombre(String nombrwe ){
            this.nombre = nombre;
        }

          -- get para nombre
        public String getNombre (){
            return nombre;
        }
         */
}
