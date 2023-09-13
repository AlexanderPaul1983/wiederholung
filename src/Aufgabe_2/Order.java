package Aufgabe_2;

import java.util.Date;

public class Order extends Product {
    private final Date datum;
    private final String giveYourComments;
    private final String orderNumber;

    private static int counter = 1;

    private double totalPrice = 0;
    private final Product[] products = new Product[5];

    // Konstruktor

    public Order(String comments) {
        this.giveYourComments = comments;
        this.datum = new Date();

        orderNumber = "B" + (counter++);

    }



    public Date getDatum() {
        return datum;
    }

    public String showYourComments() {
        return giveYourComments;
    }



    public void addProductToOrder (Product productName){
        for (int i = 0; i < products.length ; i++) {
            if (products[i] == null){
                products[i] = productName;
                totalPrice += productName.getPrice();
                return;
            }


        }
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public static void main(String[] args) {
        Order bestellung1 = new Order("Das ist die erste Bestellung");
        Order bestellung2 = new Order("Das ist die zweite Bestellung");
        Product apfel = new Product("Apfel", "Süß and lecker",2.00);
        Product birne = new Product("Birne","super tasty", 3.00);
        Product wurst = new Product("Leberwurst","130 g Schweinefleisch", 4.00);


        bestellung2.addProductToOrder(apfel);
        bestellung2.addProductToOrder(birne);
        bestellung2.addProductToOrder(birne);
        bestellung2.addProductToOrder(birne);
        bestellung2.addProductToOrder(birne);
        bestellung2.addProductToOrder(wurst);
        System.out.println(bestellung2.totalPrice);
        System.out.println(bestellung2.showYourComments());
        System.out.println(bestellung2.giveYourComments);
        System.out.println(bestellung2.getDatum());
        System.out.println(bestellung2.getOrderNumber());
        System.out.println(bestellung1.getOrderNumber());

    }


}
