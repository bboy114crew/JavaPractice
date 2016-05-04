
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
public class integer_double {
    
    public static void main(String args[]) {
        
        //Test for integer-number case
        int a = inputAnIntegerNumber("Nhap canh a: ");
        int b = inputAnIntegerNumber("Nhap canh b: ");
        int c = inputAnIntegerNumber("Nhap canh c: ");
        System.out.println("Ba canh a, b, c la: " + a + ", " + b + ", " + c);
  
        //Test for double-number case
        double x = inputADoubleNumber("Nhap canh x: ");
        double y = inputADoubleNumber("Nhap canh y: ");
        double z = inputADoubleNumber("Nhap canh z: ");
        System.out.println("Ba canh x, y, z la: " + x + ", " + y + ", " + z);

    }
    
    public static int inputAnIntegerNumber(String inputMessage) {
        
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
        
        return i;
        
    }
    
    public static double inputADoubleNumber(String inputMessage) {
        
        Scanner scan = new Scanner(System.in);
        boolean isDouble = true;
        double d = 0.0;
        do{
            System.out.print(inputMessage);
            String s1 = scan.nextLine();
        
            try{
                d = Double.parseDouble(s1);
                isDouble = true;
            }
            catch(Exception ex){
                System.out.println("Error: This (" + s1 + ") is not a double number.");
                isDouble = false;
            }
        } while(!isDouble);
        
        return d;
        
    }
    
}
