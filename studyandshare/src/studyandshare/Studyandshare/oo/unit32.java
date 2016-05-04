/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyandshare.Studyandshare.oo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NgT
 */
public class unit32 {

    public static void main(String[] args) {
        try {
            Building b = new Building();
            b.go();
        } catch (InterruptedException ex) {
            Logger.getLogger(unit32.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class MyException extends Exception {
    //Do something
}

class Building {

    public void show() throws MyException {
        int numberConnection = 0;
        if (numberConnection > 100) {
            throw new MyException();
        }
    }

    public void go() throws InterruptedException {
        Thread.sleep(1000);
    }
}
