/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringExample;

/**
 *
 * @author NgT
 */
public class StringComparePerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s1 = "Hello";
            String s2 = "Hello";            
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for creation" 
        + "of String literals : " +(endTime - startTime)
        + "milli seconds");
        
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s3 = new String("Hello");
            String s4 = new String("Hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for creation" 
        + "of String objects : " +(endTime1 - startTime1)
        + "milli seconds");
    }
}
