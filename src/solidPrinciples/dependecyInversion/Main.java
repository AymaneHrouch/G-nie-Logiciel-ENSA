package solidPrinciples.dependecyInversion;

import solidPrinciples.liskov.CoffeeShop;

interface ICoffeeShop {
    void getPayment();
    void deliverCoffee();
}

interface ICustomer {
    void makePayment();
    void receiveCoffee();
}

class LocalCoffeeShop implements ICoffeeShop{
    @Override
    public void getPayment() {

    }

    @Override
    public void deliverCoffee() {

    }
}

class PhysicalCustomer implements ICustomer{
    @Override
    public void makePayment() {

    }

    @Override
    public void receiveCoffee() {

    }
}

class MobileCustomer implements ICustomer {

    @Override
    public void makePayment() {

    }

    @Override
    public void receiveCoffee() {

    }
}

class Delivery {
    ICustomer customer;
    ICoffeeShop coffeeShop;

    public Delivery(ICustomer customer, ICoffeeShop coffeeShop) {
        this.customer = customer;
        this.coffeeShop = coffeeShop;
    }

    void deliver() {
        customer.makePayment();
        coffeeShop.getPayment();
        coffeeShop.deliverCoffee();
        customer.receiveCoffee();
    }
}

public class Main {
}
