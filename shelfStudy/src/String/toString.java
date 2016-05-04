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
public class toString {

    public static void main(String[] args) {
        String Str = new String("Home welcome you ");

        System.out.println("Value returned: ");
        System.out.println(Str.toString());
    }
}

class Student {

    int stcode;
    String name;
    String adress;

    public Student(int stcode, String name, String adress) {
        this.stcode = stcode;
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student{" + "stcode = " + stcode +
          ", name = " + name + ", adress = " + adress + '}';
    }

    public static void main(String[] args) {
        
        Student s1 = new Student(1, "Linh", "Hanoi");
        Student s2 = new Student(2, "Thang", "Bacgiang");
        
        System.out.println(s1);
        //compiler will wtite s1.toString() in here
        System.out.println(s2);
        //compiler will wtite s2.toString() in here
    }

}
