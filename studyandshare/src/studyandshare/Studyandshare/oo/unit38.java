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
public class unit38 {
    enum COLOR{
        RED(5), BLUE(6), YELOW(7), GREEN(8);
        private int value;

        private COLOR(int value) {
            this.value = value;
        }
        
        public  int getValue(){
           return value;
        }
        
        
    }
    
    public static void main(String[] args) {
        COLOR c = COLOR.BLUE;
        System.out.println(c + ": " + c.getValue());
        
    }
}
