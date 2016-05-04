/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192_06_algorithm;
import java.util.*;
/**
 *
 * @author NgT
 */
public class Freq {
    public static void main(String[] args) {
        
        String inputString  = "if it is to be it is up to me to delegate";
        System.out.println("inputString: " + inputString);
        String arrStr[] = inputString.split(" ");
        // Initialize frequency table from command line
        //Map<String, Integer> m = new HashMap<String, Integer>();
        
          LinkedHashMap<String, Integer> m = new LinkedHashMap<String, Integer>();
        for (String a : arrStr) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
    
}
