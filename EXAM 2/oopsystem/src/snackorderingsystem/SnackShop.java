package snackorderingsystem;


public class SnackShop {
    private Snack[] menu;
    private Snack[] order;
    private String customerName;
    private String customerLocation;
    private String customerPhoneNumber;
    private int orderCount; 

    public SnackShop(String customerName, String customerLocation, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerLocation = customerLocation;
        this.customerPhoneNumber = customerPhoneNumber;
        menu = new Snack[100]; 
        order = new Snack[100]; 
        orderCount = 0;
    }

    public void addSnack(Snack snack) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == null) {
                menu[i] = snack;
                break;
            }
        }
    }

    public void displayMenu() {
        System.out.println("=== Snack Menu ===");
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
                System.out.print((i + 1) + ". ");
                menu[i].displayInfo();
                System.out.println();
            }
        }
    }

    public void addToOrder(int index) {
        if (index >= 0 && index < menu.length && menu[index] != null) {
            if (orderCount < order.length) {
                order[orderCount++] = menu[index];
                System.out.println(menu[index].getName() + " has been added to your order.");
            } else {
                System.out.println("Order is full!");
            }
        } else {
            System.out.println("Invalid selection.");
        }
    }

    public void printReceipt() {
        System.out.println("=== Receipt ===");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Location: " + customerLocation);
        System.out.println("Phone Number: " + customerPhoneNumber);
        double total = 0.0;
        for (int i = 0; i < orderCount; i++) {
            System.out.println(order[i].getName() + ": $" + order[i].getPrice());
            total += order[i].getPrice();
        }
        System.out.println("Total: $" + total);
        System.out.println("================");
        System.out.println("Thank you for Choosing us!!");
    }
}


