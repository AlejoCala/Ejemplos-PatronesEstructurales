/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 * Decorator
   El patrón Decorator permite agregar funcionalidades a objetos de manera dinámica.
   Se utiliza cuando quieres extender el comportamiento de un objeto sin modificar su estructura, permitiendo agregar responsabilidades de manera flexible.
 * @author Pc-Smart
 */
public class EjecutarDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cafe cafe = new CafeSimple();
       cafe = new LecheDecorator(cafe);
       Cafe cafeSimple = new CafeSimple();
       System.out.println(cafe.getDescripcion() + " cuesta: "+cafe.costo());
       System.out.println(cafeSimple.getDescripcion() + " cuesta: "+cafeSimple.costo()); 
    }
    
}
