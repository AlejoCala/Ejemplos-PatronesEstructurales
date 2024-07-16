/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 * Objetivo: Proporciona un sustituto o representante para controlar el acceso a otro objeto.
 * 
 * Se utiliza para controlar el acceso, la carga o la seguridad de un objeto real, 
 * permitiendo realizar tareas como la carga perezosa (lazy loading) o el control de acceso.
 * @author Pc-Smart
 */
public class EjecutarProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servicio servicio = new ServicioProxy();
       servicio.realizarAccion();
    }
    
}
