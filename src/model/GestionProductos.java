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
    public ArrayList<Productos> getZapatilla() {
        return productos;
    }

    public void setZapatilla(ArrayList<Productos> productos) {
        this.productos = productos;
    }
    
    //agregar zapatillas a la lista de productos
    public void agregarProducto(Productos zap) {
        System.out.println("zappppp" + zap);
        productos.add(zap);
        System.out.println("la zapatilla modelo: " + zap.getModelo() + " marca: " + zap.getMarca() + " se agrego");
    }
    
    //mostrar lista de productos
//    public void listarCursos(){
//        for(Productos z: zap){
//            System.out.println(z);
//        }
//    }
    
    //Eliminar zapatillas de la lista de productos
//    public boolean eliminarCurso(int indice){
//        Productos eliminado = productos.remove(indice);
//        System.out.println("curso ha sido eliminado con exito");
//        return true;
//    }
    
    //modificar producto de lista  
//    public boolean modificarCurso(int indice, Curso cursoModificado){
//        if(indice >= 0 && indice < cursos.size()){
//            cursos.set(indice, cursoModificado);
//            System.out.println("curso modificado en indice: " + indice);
//            return true;
//        }
//        System.out.println("indice fuera de rango para modificar un curso");
//        return false;
//    }
}
