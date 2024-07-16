/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc-Smart
 */
public class Compuesto implements Componente {
    private List<Componente> hijos = new ArrayList<>();

    public void agregar(Componente componente){
        hijos.add(componente);
    }
    
    @Override
    public void mostrarDetalles() {
        hijos.forEach((hijo) -> {
            hijo.mostrarDetalles();
        });
    }
}
