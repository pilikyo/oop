package snackorderingsystem;

public class Burger extends Snack {
    private String size; // e.g., Small, Medium, Large

    public Burger(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Burger Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Price: $" + price);
    }
}

