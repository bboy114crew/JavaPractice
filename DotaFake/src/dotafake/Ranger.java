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
public class Ranger extends Creep implements IFlier,Ibommer{
    public int mana=3;

    public Ranger(
        String name,
        int damage,
        int health,
        int mana
    ){
        this.damage = damage;
        this.name=name;
        this.mana = mana;
        this.health = health;
    }
    
    

    
    @Override
    public void attack(int player) {
        //super.attack(player); //To change body of generated methods, choose Tools | Templates.
        player = player - (mana+damage);
        System.out.println("attack:"+player);
    }
    public void attack(int player1,int player2) {
        //super.attack(player); //To change body of generated methods, choose Tools | Templates.
        player1 = player1 - (mana+damage);
        player2 = player2 - (mana+damage);
        System.out.println("attack 2 Players:"+player1 + " "+player2);
    }   

    @Override
    public void move() {
        health =5;
        System.out.println("Move");
    }

    @Override
    public void fly() {
        Ranger.xxx --;
        System.out.println("Fly");
    }

    @Override
    public void terminate() {
        System.out.println("terminate");
    }
    public static int xxx = 5;
    public static void call()
    {
        xxx--;
        System.out.println("call"+xxx);
    }
    
}
