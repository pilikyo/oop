package snackorderingsystem;

public class Fries extends Snack {
    private String size; 

    public Fries(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fries Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Price: $" + price);
    }
}

