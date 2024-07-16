/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Pc-Smart
 */
public class FacadeComputadora {
    private final SistemaDeComputo sistema;

    public FacadeComputadora() {
        sistema = new SistemaDeComputo();
    }

    public void iniciarComputadora() {
        sistema.encender();
        sistema.cargarSistema();
    }
}
