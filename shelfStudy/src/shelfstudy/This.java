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
public class This {

}

//tham so va bien instance giong nhau
class Student10 {

    int id;
    String name;

    Student10(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + "" + name);
    }

    public static void main(String[] args) {
        Student10 s1 = new Student10(111, "Thang");
        Student10 s2 = new Student10(123, "Thu");
        s1.display();
        s2.display();
    }

}

//loi goi this() constructor chaining
class Student11{
    int id;
    String name;
    
    Student11(){
        System.out.println("Constructor mac dinh duoc goi");
        
    }
    
    Student11(int id, String name){
        this(); 
        //no duoc su dung de goi constructor cua lop hien tai
        //phai la lenh dau tien trong consttuctor neu khong se bao loi tai compile time
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        Student11 e1 = new Student11(111, "Thang");
        Student11 e2 = new Student11(222, "Thu");
        e1.display();
        e2.display();
    }
}

