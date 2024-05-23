package com.tesji.spinner.Model;

import android.media.MediaPlayer;

public class MainActivityModel {

    private int carrera;

     public String mostrarInfo() {
         String infCarreras="";
         switch (carrera){
             case 0:
                infCarreras = "por favor seleccione Carrera";
                break;
             case 1:
                 infCarreras = "ing industrial";
                 break;
             case 2:
                 infCarreras = "ing sistemas";
                 break;
             case 3:
                 infCarreras = "ing civil";
                 break;
             case 4:
                 infCarreras = "ing logistica";
                 break;
             case 5:
                 infCarreras = "ing mecatronica";
                 break;
             case 6:
                 infCarreras = "ing tics";
                 break;
             case 7:
                 infCarreras = "ing quimica";
                 break;
             case 8:
                 infCarreras = "lic administracion";
                 break;
         }
         return infCarreras;
     }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
}
