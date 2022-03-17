package com.example.vistareciclaje;

//clase para los objetos a cargar en cada vista fila
public class Nombres {

    private String nombre;
    private String capital;
    private int bandera; //chequear craga de los recursos de drawable--> int hexadecimal??

    public Nombres(String nombre, String capital, int bandera) {
        this.nombre = nombre;
        this.capital = capital;
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

    public int getBandera() {
        return bandera;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }
}

