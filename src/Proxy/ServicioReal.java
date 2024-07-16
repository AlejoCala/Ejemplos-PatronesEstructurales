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
public class ServicioReal implements Servicio {

    @Override
    public void realizarAccion() {
        System.out.println("Acción realizada por Servicio Real"); 
    }
    
}
