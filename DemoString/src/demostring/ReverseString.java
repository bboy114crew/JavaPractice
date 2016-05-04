/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostring;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author pc
 */
public class ReverseString {
     public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringTokenizer tokenizer = 
                 new StringTokenizer(input);
        
        StringBuilder builder = new StringBuilder();
        while(tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            StringBuilder revertor = new StringBuilder(token);
            builder.append(revertor.reverse());
            builder.append(" ");
        }
         System.out.println(builder.toString().trim());
     }
}
