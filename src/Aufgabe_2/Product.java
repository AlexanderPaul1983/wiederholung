package Aufgabe_2;

public class Product {
    private String Name_of_Product;
    private String Description_of_Product;
    private double Price;

    // Die Methoden


    public double getPrice() {
        return Price;
    }
    // Konstructor


    public Product(String name_of_Product, String description_of_Product, double price) {
        this.Name_of_Product = name_of_Product;
        this.Description_of_Product = description_of_Product;
        this.Price = price;
    }
    public Product(){};
}
