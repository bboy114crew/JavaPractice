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
public class unit23 {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.show();
    }
}
class Outer{
    public void show(){
            Inner in = new Inner();
            in.display();
    }
    class Inner{
        public void display(){
            System.out.println("I'm an inner class");
            
        }
    }
}
class C{
    public void show(){
            Outer.Inner in = new Outer().new Inner();
            in.display();
    }
}
