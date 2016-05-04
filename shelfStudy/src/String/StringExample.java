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
public class StringExample {

    public static void main(String[] args) {
        String s1 = "Java"; //creat string base on string literal

        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);
        //convert array char --> string
        String s3 = new String("Vi du");
        //creat string by new

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        /**
         * Sử dụng phương thức static format() của đối tượng String cho phép bạn
         * tạo một chuỗi đã được định dạng để bạn có thể tái sử dụng trái ngược
         * với lệnh in một lần
         */
//        String fs;
//        fs = String.format("Gia tri cua bien float la "
//                + "%f, trong khi gia tri cua bien integer "
//                + "bien la %d, va chuoi la "
//                + "is %s", floatVar, intVar, stringVar);
//        System.out.println(fs);
    }
}
