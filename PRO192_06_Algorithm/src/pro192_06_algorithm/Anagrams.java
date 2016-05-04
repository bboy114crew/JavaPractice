/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192_06_algorithm;

import java.util.*;
import java.io.*;

/**
 * Nen du lieu 
 * @author NgT
 */
public class Anagrams {

    public static void main(String[] args) {
        String str = "Peter";
        System.out.println(alphabetize(str));
        String filename = "C:\\Users\\NgT\\Desktop\\New Text Document.txt";
        int minGroupSize = 1;

        // Read words from file and put into a simulated multimap
        Map<String, List<String>> m = new HashMap<String, List<String>>();
        //("Peter", ("Peter", "Peert", "Peret", ...)) key & list value
        try {

            Scanner s = new Scanner(new File(filename));
            int k = 0;
            while (s.hasNext()) {
                String word = s.next();
                System.out.println("Line(" + k++ + ")" + word);
                String alpha = alphabetize(word);
                List<String> l = m.get(alpha);
                if (l == null) {
                    m.put(alpha, l = new ArrayList<String>());
                }
                l.add(word);
            }
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
        System.out.println("Display statistics");

        // Print all permutation groups above size threshold
        for (List<String> l : m.values()) {
            if (l.size() >= minGroupSize) {
                System.out.println(l.size() + ": " + l);
            }
        }
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        //neu s = "Peter" thi a = ('P', 'e', 't', 'e', 'r')
        Arrays.sort(a);
        //Uu tien upper case 
        // sau khi sort a = ('P', 'e', 'e', 'r', 't')
        return new String(a);
    }
}
