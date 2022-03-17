package com.example.ej4a;

public class Equipos {

    String nombre, ciudad, anho, pais;
    int escudo;

    public Equipos(String nombre, String ciudad, String anho, String pais, int escudo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.anho = anho;
        this.pais = pais;
        this.escudo = escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getAnho() {
        return anho;
    }

    public String getPais() {
        return pais;
    }

    public int getEscudo() {
        return escudo;
    }
}
