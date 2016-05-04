/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgame;

/**
 *
 * @author pc
 */
public class Diamond extends Item {
    public Diamond(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    @Override
    public void display() {
        System.out.print("1");
    }
    
}
