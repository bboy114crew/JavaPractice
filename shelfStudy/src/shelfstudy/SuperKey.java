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
class Vehicle {

    Vehicle() {
        System.out.println("Vehicle is created.");
    }

}

public class SuperKey extends Vehicle {

    SuperKey() {
        super();
        System.out.println("SuperKey is created");
    }

    public static void main(String[] args) {
        SuperKey s = new SuperKey();
    }

}
