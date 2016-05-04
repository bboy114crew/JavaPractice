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
public class StringAndStringBuffer {

}

//Kiểm tra hiệu suất của lớp String và StringBuffer trong Java
class Test1 {

    public static String concatWithString() {
        String t = "Java";
        for (int i = 0; i < 10000; i++) {
            t = t + "Vietjack";
        }
        return t;
    }

    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append("Vietjack");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Thoi gian tieu ton boi noi chuoi voi String: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Thoi gian tieu ton boi noi chuoi voi StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

//Kiểm tra HashCode của lớp String và StringBuffer trong Java
class Test2 {

    public static void main(String args[]) {
        System.out.println("Kiem tra Hashcode cua String:");
        String str = "java";
        System.out.println(str.hashCode());
        str = str + "tpoint";
        System.out.println(str.hashCode());

        System.out.println("Kiem tra Hashcode cua StringBuffer:");
        StringBuffer sb = new StringBuffer("java");
        System.out.println(sb.hashCode());
        sb.append("tpoint");
        System.out.println(sb.hashCode());
    }
}
