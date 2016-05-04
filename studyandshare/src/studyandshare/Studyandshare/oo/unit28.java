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
public class unit28 extends Unit{
    final float PI = 3.14f;
    int number;
    public static void main(String[] args) {
        unit28 test = new unit28();
        test.number = 15;
        //error
        //test.PI = 3.15f
    }
    
    public void change(){
        number = 30;
    }
//    error    
//    void show(){
//        
//    }
}

class Unit{
    final void show(){
        
    }
}