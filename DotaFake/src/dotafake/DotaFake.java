/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dotafake;

/**
 *
 * @author pc
 */
public class DotaFake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Creep c = new Creep();
//        c.attack(10);
//        Creep r = new Ranger();
//        r.health = 100;
//        r.damage = 5;
//        r.attack(10);
        
        Ranger r2 = new Ranger("Milu", 1000, 10000, 300);
        System.out.println(r2.damage+"");
        r2.attack(10);
        r2.attack(10, 10);
        r2.fly();
        Ranger.call();
        Ranger.call();
        
    }
    
}
