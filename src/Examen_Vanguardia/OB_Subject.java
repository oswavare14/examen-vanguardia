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
public interface OB_Subject {

    //methods to register and unregister observers
    public void register(OB_Observer obj);

    public void unregister(OB_Observer obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(OB_Observer obj);
}
