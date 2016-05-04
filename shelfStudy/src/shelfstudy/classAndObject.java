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
public class classAndObject {
    String id = "SE04385"; // member data ( instance )
    String name = "Nguy Van Thang"; // member data ( instance )
    public static void main(String[] args) {
         classAndObject cao = new classAndObject();
         System.out.println(cao.id);
         System.out.println(cao.name);
    }
}
