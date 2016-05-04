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
abstract class A{
    int x = 5;
    void foo(){
        System.out.println("x = " + x);
    }
}
public class test {
    static void foo(Integer x){
        System.out.print(x);
    }
    public static void main(String[] args) {
        A t = new A(){
            public void foo(){
                System.out.print("Hello");
            }
        };
        t.foo();
    }
}
