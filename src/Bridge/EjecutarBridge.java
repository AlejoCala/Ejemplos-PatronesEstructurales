/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *  El patrón Bridge separa una abstracción de su implementación.
 Se utiliza cuando necesitas permitir que la abstracción y la implementación cambien independientemente, 
 * como en sistemas que tienen múltiples plataformas o configuraciones.
 * @author Pc-Smart
 */
public class EjecutarBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Color azul = new Azul();
        Forma circulo = new Circulo(azul);
        circulo.dibujar();
    }
    
}
