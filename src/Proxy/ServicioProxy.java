/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Pc-Smart
 */
public class ServicioProxy implements Servicio {
    private ServicioReal servicioReal;

    @Override
    public void realizarAccion() {
        if(servicioReal == null){
            servicioReal = new ServicioReal();
        }
        System.out.println("Controlando acceso al servicio real");
        servicioReal.realizarAccion();
    }
    
    
}
