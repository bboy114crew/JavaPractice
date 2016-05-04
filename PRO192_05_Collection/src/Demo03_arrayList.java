
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author co.anhbn
 */
public class Demo03_arrayList {
    
    public static void main(String[] args) {
        
        System.out.println("CUSTOMER MANAGEMENT SYSTEM");
        System.out.println("1. List out all customers information");
        System.out.println("2. Add a new customer");
        System.out.println("3. Remove an existing customer");
        String cont = "Y";
        do {
            System.out.print("Please enter your choice: ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    //...
                    //yêu cầu có cài đặt kiểm tra nếu trùng tên thì bắt confirm
                    break;
                case 2:
                    //...
                    //yêu cầu xử lý xem có tồn tại khách hàng đó không?
                    //nếu không tồn tại thì phải thông báo khách hàng với thông tin như vậy
                    //không tồn tại
                    break;
                case 3:
                    //...
                    break;
                default:
                    System.out.println("Your entered choice is incorrect!");
            }
            scan.nextLine();
            System.out.print("Do you want to continue? (Y/N) ");
            cont = scan.nextLine();
        }
        while (cont.equalsIgnoreCase("Y"));
    }
    
}
