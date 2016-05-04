
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
public class PRO192_04_MyClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Test class MyInteger
        MyInteger k = new MyInteger();
        int x = k.input("Please enter an integer number: ");
        System.out.println("Value of x is: " + x);
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a string to convert into an integer number: ");
        String y = scan.nextLine();
        boolean isSuccess = k.parseInt(y);
        
        if (isSuccess) {
            System.out.println("Success: the current value of k is: " + k.getValue());
        }
        else {
            System.out.println("Failed: the current value of k is: " + k.getValue());
        }
    }
    
}
