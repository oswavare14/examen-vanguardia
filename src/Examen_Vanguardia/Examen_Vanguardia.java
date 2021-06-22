/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Vanguardia;

import java.io.FileNotFoundException;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author GL 502V2
 */
public class Examen_Vanguardia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        singleton();
        factory();
        builder();
        observer();
    }

    public static void singleton() throws FileNotFoundException, JavaLayerException {
        //SINGLETON -----------------------------------------
        System.out.println("SINGLETON");
        S_EagerSingleton singleton = S_EagerSingleton.getInstance();
        singleton.play("./Rootkit - Oh You.mp3");
        singleton.stop();
    }

    public static void factory() {
        // FACTORY ------------------------------------------
        System.out.println("FACTORY");
        F_PeleadorFactory vf = new F_PeleadorFactory();

        F_Peleador p1 = vf.getPeleador(F_PeleadorType.CONOR);
        p1.fighter();

        F_Peleador p2 = vf.getPeleador(F_PeleadorType.ADESANYA);
        p1.fighter();

        F_Peleador p3 = vf.getPeleador(F_PeleadorType.DIAZ);
        p3.fighter();
    }

    public static void builder() {
        // BUILDER -----------------------------------------
        System.out.println("\nBUILDER");
        B_Director director = new B_Director();

        B_PizzaBuilder pb = new B_PizzaBuilder();

        director.Piña_Jamon(pb);

        B_Pizza pizza = pb.getPizza();

        System.out.println(pizza.toString());
    }

    public static void observer() {
        //OBSERVER ------------------------------------------
        System.out.println("\nOBSERVER");
        OB_Sistema sistema = new OB_Sistema();

        OB_Observer ob1 = new OB_Persona("Juan");
        OB_Observer ob2 = new OB_Persona("Maria");
        OB_Observer ob3 = new OB_Persona("Pedro");

        sistema.register(ob1);
        sistema.register(ob2);
        sistema.register(ob3);

        ob1.setSubject(sistema);
        ob2.setSubject(sistema);
        ob3.setSubject(sistema);

        ob1.update();

        sistema.setMensaje("24");

        sistema.notifyObservers();
    }
}
