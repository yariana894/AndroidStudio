package com.example.sprinnerpersonali;

public class Estados {

    String nombre, capital,habitantes, extension;
    int  bandera;

    public Estados(String nombre, String capital, String habitantes, String extension, int bandera) {
        this.nombre = nombre;
        this.capital = capital;
        this.habitantes = habitantes;
        this.extension = extension;
        this.bandera = bandera;
    }
    public int getBandera() {
        return bandera;
    }

    public String getExtension() {
        return extension;
    }
    public String getHabitantes() {
        return habitantes;
    }
    public String getCapital() {
        return capital;
    }
    public String getNombre() {
        return nombre;
    }
}
