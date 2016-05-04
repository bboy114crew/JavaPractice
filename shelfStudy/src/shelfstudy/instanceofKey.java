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
public class instanceofKey {

}

interface Printable {
}

class A2 implements Printable {

    public void a() {
        System.out.println("Method a");
    }
}

class B implements Printable {

    public void b() {
        System.out.println("Method b");
    }
}

class Call {

    void invoke(Printable p) { //This is upcasting  
        if (p instanceof A2) {
            A2 a = (A2) p;//This is Downcasting   
            a.a();
        }
        if (p instanceof B) {
            B b = (B) p;//This is Downcasting   
            b.b();
        }

    }
}//End of class Call 

class Test4 {
    public static void main(String args[]) {
        Printable p = new B();
        Call c = new Call();
        c.invoke(p);
    }
}
