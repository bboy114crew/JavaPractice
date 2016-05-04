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
public class PRO192_06_Algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Sort & Search

        //Sorting
        List<String> arrEmp = new ArrayList<String>();
        arrEmp.add("Thang");
        arrEmp.add("Trung");
        arrEmp.add("Son");
        arrEmp.add("Vuong");
        
        dumCollection("Arraylist before sort:" ,arrEmp);
        Collections.sort(arrEmp);
        dumCollection("Arraylist after sort:" ,arrEmp);

    }

    public static void dumCollection(String arr,Collection c) {
        int N = c.size();
        System.out.println("Number of element: " + N);
        Iterator iter = c.iterator();
        for (int k = 0; k < N; k++) {
            System.out.println("Element(" +k+ "):" +iter.next());
        
    

        
    


        }
    }

   
}
