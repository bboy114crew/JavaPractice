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
public class InstanceIntializerBlock {

}

class A1 {

    A1() {
        System.out.println("constructor cua lop cha duoc trieu hoi");
    }
}

class B2 extends A {

    B2() {
        super();
        System.out.println("constructor cua lop con duoc trieu hoi");
    }

    static {
        System.out.println("instance initializer block duoc trieu hoi");
    }

    public static void main(String args[]) {
        B2 b = new B2();
    }
}
