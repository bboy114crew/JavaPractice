/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgame;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class GameController {
    Item[][] map;
    int rowNum = 5;
    int colNum = 7;
    Player player;
    Trap[] traps = new Trap[2];
    Diamond[] diamonds = new Diamond[5];
    Wall[] walls = new Wall[3];
    
    public GameController()
    {
        map = new Item[rowNum][colNum];
        //create instance of the player
        player = new Player(2,0,map);
        map[2][0] = player;
        //create walls
        walls[0] = new Wall(2, 1);
        map[2][1] = walls[0];
        walls[1] = new Wall(0, 2);
        map[0][2] = walls[1];
        walls[2] = new Wall(4, 2);
        map[4][2] = walls[2];
        
        //create trap
        traps[0] = new Trap(1, 3);
        map[1][3] = traps[0];
        
        traps[1] = new Trap(3, 4);
        map[3][4] = traps[1];
  
        // create diamond
        diamonds[0] = new Diamond(0, 1);
        map[0][1] = diamonds[0];
        diamonds[1] = new Diamond(1, 2);
        map[1][2] = diamonds[1];        
        diamonds[2] = new Diamond(4, 3);
        map[4][3] = diamonds[2];
        diamonds[3] = new Diamond(1, 5);
        map[1][5] = diamonds[3];
        diamonds[4] = new Diamond(4, 6);
        map[4][6] = diamonds[4];
    }
    
    public void display()
    {
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum;j++) {
                if(map[i][j]==null)
                {
                    System.out.print("0");
                }
                else
                {
                    map[i][j].display();
                }
            }
            System.out.println("");
        }
    }
    
    public void startGame()
    {
        display();
        Scanner scanner = new Scanner(System.in);
        String input;
        while(!isFinished())
        {
            input = scanner.nextLine();
            if(input.equals("w"))
            {
                player.up();
            }
            else if (input.equals("a"))
            {
                player.left();
            }
            else if (input.equals("s"))
            {
                player.down();
            }
            else if (input.equals("d"))
            {
                player.right();
            }
            player.isEattenDiamon(diamonds);
            display();
        }
        if(isWon())
        {
            System.out.println("You Win!");
        }
        else
        {
            System.out.println("Game over!");
        }
    }
    
    
    public boolean isFinished()
    {
        return isDeath()||isWon();
    }
    
    public boolean isDeath()
    {
        for (int i = 0; i < traps.length; i++) {
            if(traps[i].x == player.x
               &&
               traps[i].y == player.y)
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean isWon()
    {
        for(int i=0;i< diamonds.length;i++)
        {
            if(diamonds[i]!=null)
            {
                return false;
            }
        }
        return true;
    }
    
    
    
    
}
