package solidPrinciples.openClosed;

class A extends CoffeeShop implements ICoffeeShop{
    @Override
    public String generateInvoice() {
        return "some format of invoice";
    }
};

class B extends CoffeeShop implements ICoffeeShop{
    @Override
    public String generateInvoice() {
        return "BBBBBBBB format invoice";
    }
};

class InvoiceService {
    String generateInvoice(ICoffeeShop coffeeShop) {
        return coffeeShop.generateInvoice();
    }
}

class C extends CoffeeShop implements ICoffeeShop {

    @Override
    public String generateInvoice() {
        return "CCCCCCCCCCCCCCCCC";
    }
}


public class Main {
    public static void main(String[] args) {
        InvoiceService invoiceService = new InvoiceService();
        A classA = new A();
        C classC = new C();
        String result = invoiceService.generateInvoice(classC);
        System.out.println(result);
    }
}
