/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author NgT
 */
public class NumberValueOf {

    public static void main(String[] args) {
        Integer x = 9;
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");

        Integer b = Integer.valueOf("444", 16);

        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.toHexString(b));
    }
}
