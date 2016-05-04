/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyandshare.Studyandshare.oo;

/**
 *Stringbuilder and Stringbuffer
 * @author NgT
 */
public class unit44 {
    public static void main(String[] args) {
        String test = "TEST";
//        test.substring(0);
//        System.out.println(test);
        StringBuilder builder = new StringBuilder("StudyAndShare");
        StringBuffer buffer = new StringBuffer("Thang");
        
        builder.append("2016");
        System.out.println(builder);
        builder.deleteCharAt(13);
        System.out.println(builder);
        builder.delete(13,16);
        System.out.println(builder);
        builder.insert(5, "2016");
        System.out.println(builder);
        buffer.reverse();
        System.out.println(buffer);
    }
}
