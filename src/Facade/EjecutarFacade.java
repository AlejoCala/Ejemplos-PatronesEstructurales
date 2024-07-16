/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 * El patrón Facade proporciona una interfaz simplificada para un conjunto de interfaces en un subsistema.
 * @author Pc-Smart
 * 
 * Se utiliza para simplificar la interacción con subsistemas complejos, haciendo que sea más fácil de usar.
 */
public class EjecutarFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FacadeComputadora computadora = new FacadeComputadora();
        computadora.iniciarComputadora();
    }
    
}
