/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Pc-Smart
 */
class GolondrinaAdapter implements Pajaro{
    private final Golondrina golondrina;
    
    public GolondrinaAdapter(Golondrina golondrina) {
        this.golondrina = golondrina;
    }
    
    @Override
    public void volar() {
        golondrina.cantar();
        System.out.println("Golondrina volando");
    }
    
}
