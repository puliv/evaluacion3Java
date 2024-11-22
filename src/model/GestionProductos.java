/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.Productos;
import java.util.ArrayList;

/**
 *
 * @author pulie
 */
public class GestionProductos {
    private ArrayList<Productos> productos = new ArrayList();

    //getter and setter
    public ArrayList<Productos> getZapatillas() {
        return productos;
    }

    public void setZapatilla(ArrayList<Productos> productos) {
        this.productos = productos;
    }
    
    //agregar zapatillas a la lista de productos
    public void agregarProducto(Productos zap) {
        //Hay que agregar condiciones en formulario para que 
        //no permita ingresar datos incorrectos
        productos.add(zap);
//      System.out.println("la zapatilla modelo: " + zap.getModelo() + " marca: " + zap.getMarca() + " se agrego");
    }
    
    //mostrar lista de productos
    public void listarProductos(){
        for(Productos zap: productos){
            System.out.println(zap);
        }
    }
    
    //funcion para mostrar lista de detalle
    public int obtenerTamanio(){
        int contador = 0;
        for(Productos zap: productos){
            contador++;
        }
        return contador;
    }
   
    
    //Eliminar zapatillas seleccionadas de la lista de productos
    public boolean eliminarProducto(int indice){
        productos.remove(indice);
        System.out.println("Producto eliminado con exito");
        return true;
    }
    
    //modificar producto de lista  
    public boolean modificarProducto(int indice, Productos prodModificado){
        if(indice >= 0 && indice < productos.size()){
            productos.set(indice, prodModificado);
            System.out.println("producto modificado en indice: " + indice);
            return true;
        }
        System.out.println("indice fuera de rango para modificar un curso");
        return false;
    }
}
