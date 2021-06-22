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
public class B_PizzaBuilder implements B_Builder {
    private String tipoQueso, complemento, tipoPan, tamaño;

    @Override
    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    @Override
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    @Override
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public B_Pizza getPizza() {
        return new B_Pizza(tipoQueso, complemento, tipoPan, tamaño);
    }

}
