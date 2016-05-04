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
public class unit27 {
    public static void main(String[] args) {
        Room r1 = new Room();
        r1.number = 10;
        System.out.println("R1 NUMBER: " + r1.number);
        System.out.println("R1 area before: " + r1.area);
        r1.area = 300;
        System.out.println("R1 area after: " + r1.area);
        Room r2 = new Room();
        r2.number = 20;
        System.out.println("R2 NUMBER: " + r2.number);
        Room.area = 400;
        System.out.println("R2 area before: " + r2.area);
        Room r3 = new Room();
        r3.number = 30;
        System.out.println("R3 NUMBER: " + r3.number);
        System.out.println("R3 area before: " + r3.area);
        
        Room.show();
    }
}
class Room{
    static  int area = 200;
    int number;
    
    public static void show(){
        System.out.println("Show"); 
    }
}
