/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoserialization;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class DemoSerialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.Id = 1;
        student1.Name = "Long";
        student1.score = 9;
        Student student2 = new Student();
        student2.Id = 2;
        student2.Name = "Toan";
        student2.score = 10;

//        Student student3 = new Student();
//        student3.Id = 3;
//        student3.Name = "Thang";
//        student3.score = 8;
//        ArrayList<Student> list = new ArrayList<>();
//        list.add(student1);
//        list.add(student2);
//        list.add(student3);
//        try{
//            writeStudents(list);
//        }
//        
//        catch(IOException iox)
//        {
//            System.out.println(iox.getMessage());
//        }
        try {
            Student std = readStudent(4);
            System.out.println(std.Id + " "
                    + std.Name + " " + std.score);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Student readStudent(int id) throws Exception {
        Student std = null;
        FileInputStream fis
                = new FileInputStream(id + ".std");
        ObjectInputStream ois
                = new ObjectInputStream(fis);
        std = (Student) ois.readObject();
        return std;
    }

    public static void writeStudents(ArrayList<Student> students) throws IOException {
        for (Student student : students) {
            FileOutputStream fos
                    = new FileOutputStream(student.Id + ".std");
            ObjectOutputStream oos
                    = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
            fos.close();
        }
    }

}
