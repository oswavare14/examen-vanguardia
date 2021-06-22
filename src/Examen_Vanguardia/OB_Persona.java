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
public class OB_Persona implements OB_Observer {

    private String nombre;
    private OB_Subject subject;

    public OB_Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update() {
        String msg = (String) subject.getUpdate(this);
        
        if (msg == null) {
            System.out.println(nombre + ":: Sigue el mismo numero");
        } else {
            System.out.println(nombre + ":: Numero a seguir ::" + msg);
        }
    }

    @Override
    public void setSubject(OB_Subject subject) {
        this.subject = subject;
    }
}
