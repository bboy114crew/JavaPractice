/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyandshare.Studyandshare.oo;

/**
 *
 * @author NgT
 */
public class unit22 {

    public static void main(String[] args) {
        A a1 = new A();
        a1.setName("Thang");
        System.out.println(a1.getName());
        A a2 = new A();
        a2.setName("Nguy");
        System.out.println(a2.getName());
        System.out.println("");
        B b1 = new B();

    }
}

class A {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    

    
}

class B {

}
