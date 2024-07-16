/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Pc-Smart
 */
public class Hoja implements Componente{
    private final String nombre;

    public Hoja(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Hoja: "+ nombre);
    }
    
}
