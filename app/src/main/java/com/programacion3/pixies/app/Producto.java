package com.programacion3.pixies.app;

public class Producto {
    private int image;
    private String categoria;
    private int cantidad;
    private int precio;
    private String nombre;

    public Producto(int image, int cantidad, int precio, String nombre) {
        this.image = image;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
    }

    public Producto(int image, int cantidad, int precio, String nombre, String categoria) {
        this.image = image;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}