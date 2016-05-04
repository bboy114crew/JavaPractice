
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author co.anhbn
 */
public class Demo02_arrayList {
    
    
    
    public static void main(String[] args) {
        
        ArrayList<Product> lstProducts;
        
        System.out.println("Demo using ArrayList in Java");
        lstProducts = new ArrayList<Product>();
        System.out.println("Số lượng phần tử lúc này của mảng lstProducts: " + lstProducts.size());
        
        Product p1 = new Product("P0001", "Laptop Sony VPCSA4J", 22000000.0);
        lstProducts.add(p1);
        
        Product p2 = new Product("P0002", "iPhone 6S Plus 128GB", 26000000.0);
        lstProducts.add(p2);
        
        System.out.println("Số lượng phần tử lúc này của mảng lstProducts: " + lstProducts.size());
        
        for (Product p: lstProducts) {
            System.out.println(p);
        }
        
        System.out.println("Xóa phần tử thứ 2 trong ArrayList");
        lstProducts.remove(1);
        
        System.out.println("Số lượng phần tử lúc này của mảng lstProducts: " + lstProducts.size());
        
        for (Product p: lstProducts) {
            System.out.println(p);
        }
        
        System.out.println("Finished!");
        
    }
    
}
