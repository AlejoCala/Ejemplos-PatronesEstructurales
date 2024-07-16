/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import java.math.BigDecimal;

/**
 *
 * @author Pc-Smart
 */
public class CafeSimple implements Cafe {

    @Override
    public String getDescripcion() {
        return "Cafe Simple";
    }

    @Override
    public BigDecimal costo() {
        return new BigDecimal("10.15");
    }
    
}
