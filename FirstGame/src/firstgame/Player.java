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
public class Player extends Item {

    Item[][] map;

    public Player(int x, int y, Item[][] map) {
        this.x = x;
        this.y = y;
        this.map = map;
    }

    public void up() {
        map[x][y] = null;
        x--;
        map[x][y] = this;
    }

    public void down() {
        map[x][y] = null;
        x++;
        map[x][y] = this;
    }

    public void left() {
        map[x][y] = null;
        y--;
        map[x][y] = this;
    }

    public void right() {
        map[x][y] = null;
        y++;
        map[x][y] = this;
    }

    @Override
    public void display() {
        System.out.print("9");
    }

    void isEattenDiamon(Diamond[] diamonds) {
        for (int i = 0; i < diamonds.length; i++) {
            if (diamonds[i]!=null && diamonds[i].x == this.x
                    && diamonds[i].y == this.y) {
                diamonds[i] =null;
                break;
            }
        }

    }

}
