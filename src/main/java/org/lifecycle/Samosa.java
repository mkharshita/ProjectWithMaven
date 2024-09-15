package org.lifecycle;

public class Samosa {
    private double price;

    public Samosa(double price) {
        this.price = price;
    }

    public Samosa() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Set Price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void hey(){
        System.out.println("Inside init method");
    }

    public void bye(){
        System.out.println("Inside destory method");
    }
}
