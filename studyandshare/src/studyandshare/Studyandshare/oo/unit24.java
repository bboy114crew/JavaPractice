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
public class unit24 {
    public static void main(String[] args) {
        Manager man = new Manager();
        man.show();
        
    }
    
}

interface Human{
    public static final int AGV_AGE = 100;
    int AVG_WEIGHT = 60; //ko khai bao thi se tu hieu la public static final
    
    public abstract void show();
    
    void study();// ko khai bao nhung se van tu hieu la public abstract;
    
}
class Manager implements Human{

    @Override
    public void show() {
        System.out.println("AVG AGE:" + AGV_AGE);
    }

    @Override
    public void study() {
        
    }
    
}