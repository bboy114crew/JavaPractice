
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
public class do_while_for {
    
    //viết chương trình nhập vào một số nguyên, 
    //kiểm tra xem số đó có phải là số chẵn hay không
    //nếu có thì cộng dồn vào một biến Tổng
    //chương trình sẽ lặp đi lặp lại cho đến khi người dùng không muốn thực hiện nữa
    //thì hiển thị giá trị của tổng tích lũy này.
    //yêu cầu làm theo 2 cách while() do và do while()
    
    public static void main(String[] args) {
        
        int val = 0;
        String cont = "Y";
        Scanner scan = new Scanner(System.in);
        long Sum = 0;
    
    //cách 1: viết theo kiểu while() do
        
//        while (cont.equalsIgnoreCase("Y")) {
//            System.out.print("Please enter an integer value: ");
//            val = scan.nextInt();
//            if (val % 2 == 0) {
//                System.out.println("This number " + val + " is an even number.");
//                Sum += val;
//            }
//            
//            scan.nextLine();
//            
//            System.out.println("Current value of Sum is: " + Sum);
//            System.out.println("Do you want to continue? (Y/N) ");
//            System.out.print("Answer: ");
//            cont = scan.nextLine();
//        }
//        System.out.println("The final value of Sum is: " + Sum);
    
    //Cách 2: viết theo kiểu do...while()
        System.out.println("Method 2: using do...while() structure");
    
        do {
            System.out.print("Please enter a number: ");
            val = scan.nextInt();

            if (val % 2 == 0) {
                System.out.println("The number " + val + " is an even number.");
                Sum += val;
            }
            System.out.println("The current value of Sum is: " + Sum);
            scan.nextLine();

            System.out.println("Do you want to continue? (Y/N) ");
            System.out.print("Answer: ");
            cont = scan.nextLine();
        }
        while (cont.equalsIgnoreCase("Y"));
        
        System.out.println("The final value of Sum is: " + Sum);
    
    }
    
    
    
    
}
