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
public interface B_Builder {

    void setTipoQueso(String tipoQueso);
    void setComplemento(String complemento);
    void setTipoPan(String tipoPan);
    void setTamaño(String tamaño);
    B_Pizza getPizza();
}
