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
public abstract class Forma {
    protected Color color;
    
    protected Forma(Color color){
        this.color = color;
    }
    
    abstract void dibujar();
}
