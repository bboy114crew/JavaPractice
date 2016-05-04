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
public class Immutable {
    public static void main(String[] args) {
        String s = "Nguy thang";
        s.concat("Nguy thang handsome");
        //concat() them vao cuoi chuoi
        System.out.println(s);
        //print out Nguythang beacause STRING IS IMMUTABLE.
    }
}

// Gan s voi bien tham chieu mot cach tuong minh thi no se 
// tham chieu toi doi tuong "Nguy thang handsome"

class TestImmutableString{
    public static void main(String[] args) {
        String s = "Linh";
        s = s.concat(" Hap");
        System.out.println(s);
    }
    
    
    
    
//create immutable class in java
/**
 * Biến instance của lớp là final, tức là chúng ta 
 * không thể thay đổi giá trị của nó sau khi tạo một đối tượng.
 * Lớp là final, vì thế bạn không thể tạo lớp con.
 * Không có phương thức setter 
 * do đó bạn không có tùy chọn để thay đổi giá trị của biến instance.
 */
    public final class Employee{
        final String IDno;
        
        public Employee(String IDno){
            this.IDno = IDno;
        }
        
            public String getIDno(){
                return IDno;
            }
    }
}




