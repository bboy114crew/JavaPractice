/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author NgT
 */
public class ComparString {

}

class Sosanhchuoi1 {

    public static void main(String[] args) {
        String s1 = "Vietjack";
        String s2 = "Vietjack";
        String s3 = new String("Vietjack");
        String s4 = "Vietjackteam";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}

class Sosanhchuoi2 {

    public static void main(String[] args) {
        String s1 = "Vietjack";
        String s2 = "VIETJACK";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}

class Sosanhchuoi3 {
//toan tu == so sanh tham chieu chu khong phai gia tri
    public static void main(String[] args) {
        String s1 = "Vietjack";
        String s2 = "Vietjack";
        String s3 = new String("Vietjack");

        System.out.println(s1 == s2);
        //true vi ca hai cung tham chieu toi cung instance
        System.out.println(s1 == s3);
        //false vi s3 tham chieu toi instance khong phai trong pool
    }
}


class Teststringcomparison4{  
 public static void main(String args[]){  
   String s1="Vietjack";  
   String s2="Vietjack";  
   String s3="Doan";  
   System.out.println(s1.compareTo(s2));//0  
   System.out.println(s1.compareTo(s3));//1(boi vi s1 > s3)  
   System.out.println(s3.compareTo(s1));//-1(boi vi s3 < s1 )  
 }  
} 