/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Pc-Smart
 */
public class LecheDecorator extends CafeDecorator {

    public LecheDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " con leche";
    }
    
    @Override
    public BigDecimal costo(){
        return cafe.costo().add(new BigDecimal("0.40"));
    }
    
}
