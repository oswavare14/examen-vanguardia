/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_Vanguardia;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author GL 502V2
 */
public class S_EagerSingleton {

    private static volatile S_EagerSingleton instance = new S_EagerSingleton();
    private Player player;

    S_EagerSingleton() {
    }

    public static S_EagerSingleton getInstance() {
        return instance;
    }

    public void play(String nombre) throws FileNotFoundException, JavaLayerException {
        BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(nombre));
        player = new Player(buffer);
        //player.play();
        System.out.println("Play :: " + nombre);
    }

    public void stop() {
        //player.close();
        System.out.println("Stop \n");
    }
}
