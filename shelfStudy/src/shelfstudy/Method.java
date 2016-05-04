/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelfstudy;

/**
 *
 * @author NgT
 */
public class Method {

}

/*Overloading method : Mot lop co hai hoac nhieu phuong thuc cung
ten nhung khac nhau ve tham so
 */
class ExpOverloading {

    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        double c = 7.3;
        double d = 9.4;
        int result1 = minFunction(a, b);
        //cung ten ham voi tham so khac nhau
        double result2 = minFunction(c, d);

        System.out.println("Min value : " + result1);
        System.out.println("Min value : " + result2);
    }

    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

    public static double minFunction(double n1, double n2) {
        double min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }
}
