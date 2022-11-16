package solidPrinciples.liskov;

class A extends CoffeeShop implements CanTakeaway{
    @Override
    public String takeaway() {
        return "hehe";
    }
}
class B extends CoffeeShop {}

public class Main {
}
