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
public class StringAppend {
    
}
class Noichuoi1{
    public static void main(String[] args) {
        String s = "Nguy" + " Thang";
        //compiler convert this code 
        //--> String s=(new StringBuilder()).append("Nguy").append(" Thang).toString();  
        System.out.println(s);
    }
}
class Noichuoi2{  
 public static void main(String args[]){  
   String s=50+30+"Nguythang"+40+40;  
   System.out.println(s);//print out 80Nguythang4040  
 }  
}  

//concat()

class Noichuoi3{
    public static void main(String[] args) {
        String s1 = "Nguy";
        String s2 = " Thang";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}