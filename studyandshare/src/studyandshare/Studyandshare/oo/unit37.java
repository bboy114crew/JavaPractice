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
public class unit37 {

    enum COLOR {
        RED, BLUE, YELOW, GREEN
    }

    public static void main(String[] args) {
        System.out.println(COLOR.BLUE);
        COLOR c = COLOR.GREEN;
        System.out.println(c);
        System.out.println(c.YELOW);

        if (c == COLOR.RED) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        switch (c) {
            case RED:
                System.out.println("Red");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            case YELOW:
                System.out.println("Yelloe");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            default:
                throw new AssertionError();
        }
    }

}
