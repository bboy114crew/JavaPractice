/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelfstudy;

/**
 *
 * @author NgT
 */
public class Upcasting {

}

class Bike {

    void run() {
        System.out.println("dang chay");
    }
}

class Splender extends Bike {

    void run() {
        System.out.println("Run safe with 60km");
    }

    public static void main(String args[]) {
        Bike b = new Splender();//this is upcasting  
        b.run();
    }
}
