package snackorderingsystem;

public abstract class Snack {
    protected String name;
    protected double price;

    public Snack(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}

