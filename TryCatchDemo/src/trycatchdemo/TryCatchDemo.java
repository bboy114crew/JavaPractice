/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchdemo;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TryCatchDemo {
    
    public int divide(int a,int b) throws ArithmeticException,IndexOutOfBoundsException
    {
        int c;
         c = a/b;
        return c;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       try{
//            TryCatchDemo demo = new TryCatchDemo();
//            demo.divide(5, 0);
//       }
//       catch(ArithmeticException ex)
//       {
           //System.out.println(ex.getMessage());
//            try{
//                int[] b = {};
//                System.out.println(""+b[1]);  
//            }
//            catch(Exception iobex)
//            {
//                System.out.println("An IndexOutOfBoundsException orcurr");  
//            }
           
//       }
       
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        try{
            Integer.parseInt(value);
            System.out.println("This is an integer!");
        }
        catch(NumberFormatException nfe)
        {
            try{
                Float.parseFloat(value);
                System.out.println("This is a float!");
            }
            catch(NumberFormatException nfe2)
            {
                System.out.println("This is a string!");
            }
        }
    }
    
}
