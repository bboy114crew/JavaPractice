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
public class Static {

}

class Student8 {

    int rollno;
    String name;
    static String college = "Bach khoa";

    Student8(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student8 s1 = new Student8(111, "thang");
        Student8 s2 = new Student8(222, "Nguy");

        s1.display();
        s2.display();
    }

}
//Chuong trinh counter ma khong su dung bien static

class Counter {

    int count = 0; //se lay memmory khi bien instance duoc tao
    //print out screen threes 1 in threes line

    Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

//Chuong trinh counter su dung bien static

class Counter2{
    static int count = 0; //se lay memory chi mot lan va giu lai gia tri cua no
    //printf out screen 1 , 2, 3
    Counter2(){
        count ++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        Counter2 c3 = new Counter2();
    }
}

class Student9{  
     int rollno;  
     String name;  
     static String college = "BachKhoa";  
       
     static void change(){  
     college = "QuocGia";  
     }  
  
     Student9(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
    Student9.change();  
  
    Student9 s1 = new Student9 (111,"Hoang");  
    Student9 s2 = new Student9 (222,"Thanh");  
    Student9 s3 = new Student9 (333,"Nam");  
  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}   