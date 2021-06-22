/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Vanguardia;

/**
 *
 * @author GL 502V2
 */
public class B_Director {

    public void Pepperoni(B_Builder builder) {
        builder.setTipoQueso("Suizo");
        builder.setComplemento("Pepperoni");
        builder.setTipoPan("Artesanal");
        builder.setTamaño("Grande");
    }

    public void Jamon(B_Builder builder) {
        builder.setTipoQueso("parmesano");
        builder.setComplemento("Jamon");
        builder.setTipoPan("Integral");
        builder.setTamaño("Grande");
    }
    
    public void Piña_Jamon(B_Builder builder) {
        builder.setTipoQueso("mozzarela");
        builder.setComplemento("Piña con Jamon");
        builder.setTipoPan("Artesanal");
        builder.setTamaño("Grande");
    }

}
