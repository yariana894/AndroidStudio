package com.example.ejercicio4b;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(String habitantes) {
        this.habitantes = habitantes;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getBandera() {
        return bandera;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }
}
