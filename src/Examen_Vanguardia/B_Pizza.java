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
public class B_Pizza {
    private String tipoQueso,complemento,tipoPan, tamaño;

    public B_Pizza(String tipoQueso, String complemento, String tipoPan, String tamaño) {
        this.tipoQueso = tipoQueso;
        this.complemento = complemento;
        this.tipoPan = tipoPan;
        this.tamaño = tamaño;
    }

    public B_Pizza() {
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Pizza{" + "tipoQueso=" + tipoQueso + ", complemento=" + complemento + ", tipoPan=" + tipoPan + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}
