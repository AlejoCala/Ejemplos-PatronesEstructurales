/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 * El patrón Composite permite tratar a objetos individuales y composiciones de objetos de manera uniforme.
 * Se utiliza en estructuras jerárquicas donde quieres que los clientes puedan tratar tanto hojas (objetos individuales)
 * como compuestos (colecciones de objetos) de la misma manera.
 * @author Pc-Smart
 */
public class EjecutarComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compuesto raiz = new Compuesto();
        raiz.agregar(new Hoja("Hoja 1"));
        raiz.agregar(new Hoja("Hoja 2"));
        raiz.agregar(new Hoja("Hoja 3"));
        
        Compuesto subCompuesto = new Compuesto();
        subCompuesto.agregar(new Hoja("Hoja 4"));
        raiz.agregar(subCompuesto);
        raiz.mostrarDetalles();
    }
    
}
