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
public abstract class Creep {
    public String name;
    public int damage;
    protected int health;
    
    public abstract void attack(int player);
    public abstract void move();
}
