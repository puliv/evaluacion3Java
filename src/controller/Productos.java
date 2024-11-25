/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author pulie
 */
//Entidad Asociada
public class Productos {
    private String marca, modelo;
    private int talla, precio;


    public Productos() {
    }

    public Productos(String marca, String modelo, int talla, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.talla = talla;
        this.precio = precio;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    

    @Override
    public String toString() {
        return 
                "\ntalla:" + talla +
                "\nprecio: " + precio + 
                "\nmarca: " + marca + 
                "\nmodelo: " + modelo;
    }

    
    
}
