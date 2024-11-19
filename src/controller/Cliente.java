/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author pulie
 */

//Entidad Principal
public class Cliente {
    private int id;
    private String nombre, metodoPago;
    private Productos zapatillas;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String metodoPago, Productos zapatillas) {
        this.id = id;
        this.nombre = nombre;
        this.metodoPago = metodoPago;
        this.zapatillas = zapatillas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Productos getZapatillas() {
        return zapatillas;
    }

    public void setZapatillas(Productos zapatillas) {
        this.zapatillas = zapatillas;
    }
    
    
}
    