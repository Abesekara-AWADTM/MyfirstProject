package Polymorphism;

/*
 * 1. Compile time polymorphism or method overloading or static banding
 *                 If the class contains two or more methods having the same name and different arguments 
then it is method overloading

                       Method Overloading: changing no. of arguments


   2. Runtime polymorphism or method overriding or dynamic binding
                    Runtime polymorphism is a process in which a call to an overridden method
                    

 */

public class Polymorphism {
    public static void main(String[] args) {
        CashPayment c = new CashPayment();
        c.pay();

        Payment p = new CashPayment();
        p.pay(); // Pay by cash
        
        p = new CreditPayment();
        p.pay(); // Pay by creditcard
    }
}

/**
 * This represents payment interface
 */
interface Payment {
    public void pay();
}

/**
 * Cash IS-A Payment type
 * 
 */
class CashPayment implements Payment {
    // method overriding
    @Override
    public void pay() {
        System.out.println("This is cash payment");
    }
}

/**
 * Creditcard IS-A Payment type
 */
class CreditPayment implements Payment {
    // method overriding
    @Override
    public void pay() {
        System.out.println("This is credit card payment");
    }
}
