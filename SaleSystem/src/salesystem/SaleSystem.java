/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesystem;

import java.util.*;

/**
 *
 * @author pc
 */
public class SaleSystem {

    public DatabaseContext database
            = new DatabaseContext();

    public void getUserInput() {
        displayAd();
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        while (!input.equals("0")) {
            switch (input) {
                case "1":
                    addCustomer();
                    break;
                case "2":
                    addProduct();
                    break;
                case "3":
                    buyOrder();
                    break;
                case "4":
                    System.out.println("Order ID:");
                    int orderID = Integer.parseInt(scanner.nextLine());
                    Order order = database.findOrderByID(orderID);
                    System.out.println(order.toString());
                    break;
            }
            displayAd();
            input = scanner.nextLine();
        }
    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Products ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Products Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Products Price:");
        float price = Float.parseFloat(scanner.nextLine());
        Product product = new Product(id, name, price);
        database.addProduct(product);
    }

    public void buyOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Order ID:");
        int orderID = -1;
        boolean isCorrectFormatOrderID = false;
        while (!isCorrectFormatOrderID) {
            try {
                orderID = Integer.parseInt(scanner.nextLine());
                isCorrectFormatOrderID = true;
            } catch (NumberFormatException ex) {
                System.out.println("Your orderID is not corrected format! Please try again:");
            }
        }
        System.out.println("Enter Payment Method:");
        String paymentMethod = scanner.nextLine();
        Date date = new Date();

        System.out.println("Enter Customer ID: ");
        String customerID = scanner.nextLine();
        Customer customer = database.findCustomerByID(customerID);
        System.out.println("How many products you would like to buy?");
        int numberOfProduct = Integer.parseInt(scanner.nextLine());
        Order order = new Order(orderID, paymentMethod, date, customer);
        for (int i = 0; i < numberOfProduct; i++) {
            System.out.println("Product ID: ");
            int productID = Integer.parseInt(scanner.nextLine());
            Product product = database.findProductByID(productID);
            System.out.println("Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            OrderLine line
                    = new OrderLine(product, product.price, quantity);
            order.addOrderLine(line);
        }
        database.addOrder(order);
    }

    public void addCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter Customer Name: ");
        String Name = scanner.nextLine();
        Customer cust = new Customer(id, Name);
        database.addCustomer(cust);
        System.out.println("Customer is added!");
    }

    public void displayAd() {
        System.out.println("1 - Add Customer");
        System.out.println("2 - Add Product");
        System.out.println("3 - Buy Product");
        System.out.println("4 - Search Order");
        System.out.println("0 - Exit");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SaleSystem salesystem = new SaleSystem();
        salesystem.getUserInput();
    }

}
