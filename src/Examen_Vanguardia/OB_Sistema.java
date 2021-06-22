/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Vanguardia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GL 502V2
 */
public class OB_Sistema implements OB_Subject {

    private List<OB_Observer> observers;
    private String mensaje;

    public OB_Sistema() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(OB_Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(OB_Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<OB_Observer> temp = null;

        temp = new ArrayList<>(this.observers);

        for (OB_Observer obj : temp) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(OB_Observer obj) {
        return this.mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
