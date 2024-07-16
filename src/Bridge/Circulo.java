/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author Pc-Smart
 */
public class Circulo extends Forma {

    public Circulo(Color color) {
        super(color);
    }

    @Override
    void dibujar() {
        color.pintar();
        System.out.println("Dibujando figura circular");
    }
    
    
}
