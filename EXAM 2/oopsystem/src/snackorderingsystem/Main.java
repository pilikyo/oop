package snackorderingsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter your location: ");
        String customerLocation = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String customerPhoneNumber = scanner.nextLine();

         
        SnackShop snackShop = new SnackShop(customerName, customerLocation, customerPhoneNumber);

        
        snackShop.addSnack(new Burger("Cheeseburger", 25.00, "Regular"));
        snackShop.addSnack(new Burger("EggSandwich", 20.00, "Regular"));
        snackShop.addSnack(new Fries("Burger", 25.00, "Regular"));
        snackShop.addSnack(new Fries("EggBurger", 30.00, "Large"));
        snackShop.addSnack(new Fries("Burger with Egg & Cheese", 35.00, "Large"));
        snackShop.addSnack(new Fries(" Fries with Cheese", 25.00, "Regular"));
        snackShop.addSnack(new Fries(" Fries with Cheese", 35.00, "Medium"));
        snackShop.addSnack(new Fries(" Fries with Cheese", 45.00, "Large"));
        snackShop.addSnack(new Fries(" Fries with SourCream", 25.00, "Regular"));
        snackShop.addSnack(new Fries(" Fries with SourCream", 35.00, "Medium"));
        snackShop.addSnack(new Fries(" Fries with SourCream", 45.00, "Large"));
        

        while (true) {
            snackShop.displayMenu();
            System.out.print("Select a snack to add to your order (0 to finish): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            snackShop.addToOrder(choice - 1); 
        }

       
        snackShop.printReceipt();

        scanner.close();
    }
}

