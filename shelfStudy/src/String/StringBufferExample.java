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
public class StringBufferExample {
    
}

class thangAppend{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println(sb);
    }
}

class thangInsert{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(1, "Java"); //insert bat dau tu vi tri thu 1 
        System.out.println(sb); // prin out HJavallo
    }
}

class thangReplace{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java");
        //thay the vi tri tu 1 --> 3 bang Java
        System.out.println(sb);
        //print put HJavalo
    }
}

class thangDelete{
    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer("Hello");
        sb.delete(1, 3);
        System.out.println(sb);
    }
}

class thangReverse{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.reverse();
        System.out.println(sb);
    }
}

