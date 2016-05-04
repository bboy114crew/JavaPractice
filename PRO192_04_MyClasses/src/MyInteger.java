
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author co.anhbn
 */
public class MyInteger {
    
    private int value = 0;

    public MyInteger() {
        value = 0;
    }
    
    public MyInteger(int x) {
        value = x;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int x) {
        this.value = x;
    }
    
    public int input(String inputMessage) {
    
        Scanner scan = new Scanner(System.in);
        boolean isInteger = true;
        int i = 0;
        do{
            System.out.print(inputMessage);
            String s1 = scan.nextLine();
        
            try{
                i = Integer.parseInt(s1);
                isInteger = true;
            }
            catch(Exception ex){
                System.out.println("Error: This (" + s1 + ") is not an integer number.");
                isInteger = false;
            }
        } while(!isInteger);
        
        value = i;
        return i;

    }
    
    public boolean parseInt(String s) {
        //if return value is true => convert to integer is successfull
        //if return false => un-successfull
        
        try {
            value = Integer.parseInt(s);
            return true;
        }
        catch (Exception ex) {
            System.out.println("Error: system cannot convert s into integer number!");
            return false;
        }
    }
    
    
    
    
    
}
