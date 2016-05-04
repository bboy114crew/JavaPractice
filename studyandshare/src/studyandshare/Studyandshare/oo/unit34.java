/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyandshare.Studyandshare.oo;

/**
 *
 * @author NgT
 */
public class unit34 extends Tutorial {

    public static void main(String[] args) {
        unit34 u = new unit34();
        System.out.println(u.add(3, 5));
        System.out.println(u.add(3.5f, 5.4f));
        System.out.println(u.add("Nguy ", "Thang"));
    }

    public int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }
}

class Tutorial {

    public String add(String str1, String str2) {
        return str1 + str2;
    }
}
