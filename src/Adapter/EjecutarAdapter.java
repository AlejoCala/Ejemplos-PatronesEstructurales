/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 * * ADAPTER El patrón Adapter permite que interfaces incompatibles trabajen juntas. 
 *  Se utiliza cuando tienes una clase existente con una interfaz no compatible que necesitas usar con otra interfaz.
 * 
 * 
 * @author Pc-Smart
 */
public class EjecutarAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Golondrina golondrina = new Golondrina();
        Pajaro pajaro = new GolondrinaAdapter(golondrina);
        pajaro.volar();
        
        Helicoptero helicoptero = new Helicoptero();
        Volador volador = new HelicopteroAdapter(helicoptero);
        volador.volar();
    }
    
}
