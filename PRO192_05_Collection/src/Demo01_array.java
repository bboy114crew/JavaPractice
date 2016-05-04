
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
public class Demo01_array {
    
    public static void main(String[] args) {
        
        //Tạo mảng lưu trữ 100 số đầu tiên trong chuỗi Fibonaci
        //F[0] = 1
        //F[1] = 1
        //F[2] = F[1] + F[0] = 2
        //F[3] = F[2] + F[1] = 3
        //F[50] = ? = F[49] + F[48]
        
        //long[] Fibo;
        //Fibo = new long[100];
        
        long[] Fibo = new long[100];
        Fibo[0] = 1;
        Fibo[1] = 1;
        for (int i=2; i<100; i++) {
            Fibo[i] = Fibo[i-1] + Fibo[i-2];
        }
        
        System.out.println("Generate Fibonaci series is completed!");
        
        Scanner scan = new Scanner(System.in);
        String ans = "Y";
        
        while (ans.equalsIgnoreCase("Y")) {
            System.out.print("What is the position of Fibonaci series you need to lookup? ");
            int k = scan.nextInt();
            System.out.println("Fibonaci[" + k + "] = " + Fibo[k]);
            scan.nextLine();
            System.out.print("Do you want to continue? (Y/N) ");
            ans = scan.nextLine();
        }
        
        String[] listProducts = new String[1000];
        System.out.println("Number of elements in array listProducts: " + listProducts.length);
        listProducts[5] = "Hello world!";
        System.out.println("Length of element[6]: " + listProducts[5].length());
        
        
        int[] Arr;
        Arr = new int[2];
        Arr[0] = 1;
        Arr[1] = 1;
        Arr = new int[3];
        Arr[2] = 2;
        
        for (int j=0; j<3; j++) {
            System.out.println("Arr["+j+"]=" + Arr[j]);
        }
        
    }
    
}
