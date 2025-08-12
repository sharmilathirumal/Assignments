package org.example;

public class Product implements Taxable {
    private int product_Id;
    private double price;
    private int quantity;

    public Product(int productId, double productPrice, int productQuantity) {
        this.product_Id =productId;
        this.price = productPrice;
        this.quantity = productQuantity;
    }

    public int getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(int product_Id) {
        this.product_Id = product_Id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        double productPrice = price * quantity;
        double productTax = productPrice * salesTax;
        System.out.println("Sales Tax for product (ID: " + product_Id + "): $" + productTax);
    }
}
