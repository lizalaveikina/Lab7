package ua.edu.ucu.apps.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        
        System.out.println("Card");
        return price;
    }

}
