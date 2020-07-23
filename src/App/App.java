/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Ventanas.Cargar;
import Ventanas.Ventana;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author @BrunoDev, BrunoBeltreGuzman
 */
public class App {

    public static void main(String[] args) {

        Cargar cargar = new Cargar();
        cargar.setVisible(true);

        Timer t = new Timer();
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                cargar.dispose();

                Ventana v = new Ventana();
                v.setVisible(true);
            }
        };
        t.schedule(tarea, 3000);
    }

}
