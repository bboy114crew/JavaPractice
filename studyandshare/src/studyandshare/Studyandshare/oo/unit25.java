/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyandshare.Studyandshare.oo;

/**
 * Access modifiers
 * @author NgT
 */
public class unit25 {
    public static void main(String[] args) {
        Boss b1 = new Boss();
        System.out.println(b1.adress);
    }
}

class Boss{
    public int age; // Everywhere
    protected String name; //Same package, its subclasses
    String adress; //same package
    private int numberOfWives;//Only for it
}
