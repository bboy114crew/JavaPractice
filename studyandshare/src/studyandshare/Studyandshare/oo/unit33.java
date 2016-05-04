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
public class unit33 {

    public static void main(String[] args) {
        unit33 u = new unit33();
        System.out.println(u.add(3, 5));
        System.out.println(u.add(3.5f, 5.4f));
    }

    public int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }
}
