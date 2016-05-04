/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelfstudy;

//import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 *
 * @author NgT
 */
public class Constructor {

}
//Default Constructor in java

class Bike1 {

    Bike1() {
        System.out.println("Bike duoc tao");

    }

    public static void main(String[] args) {
        Bike1 b = new Bike1();
    }
}

//Default Constructor creat default value 
class Student3 {

    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.display();
        s2.display();
    }
}

//Constructor duoc tham so hoa 
class Student4 {

    int id;
    String name;

    Student4(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student4 s1 = new Student4(111, "Karan");
        Student4 s2 = new Student4(222, "Aryan");
        s1.display();
        s2.display();
    }
}

//Overloading constructor in java
class Student5 {

    int id;
    String name;
    int age;

    Student5(int i, String n) {
        id = i;
        name = n;
    }

    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    
    void display(){
        System.out.println(id + " " + name + " " + age);
    }
    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Thang");
        Student5 s2 = new Student5(222, "Thu", 41);
        s1.display();
        s2.display();
    }
}
