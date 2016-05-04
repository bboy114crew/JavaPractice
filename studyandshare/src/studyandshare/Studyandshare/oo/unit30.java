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
public class unit30 {

    public static void main(String[] args) {
        String test = "StudyAndShare";
        try {
            System.out.println("Before");
            //50 --> error
            //System.out.println(test.substring(50));
            System.out.println(test.substring(10));
            int a = 5;
            int b = 0;
            System.out.println("a/b: " + a / b);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.toString());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.toString());
        } catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
        finally{
            System.out.println("Always done");
        }

        System.out.println("After");
    }
}
