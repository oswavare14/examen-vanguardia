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
public class F_PeleadorFactory {

    public F_Peleador getPeleador(F_PeleadorType PeleadorType) {
        F_Peleador peleador = null;

        switch (PeleadorType) {
            case CONOR:
                peleador = new F_Conor();
                break;
            case ADESANYA:
                peleador = new F_Adesanya();
                break;
            case DIAZ:
                peleador = new F_Diaz();
                break;
        }
        return peleador;
    }

}
