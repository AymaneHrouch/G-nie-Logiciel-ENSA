package designPatterns.factory;

public class DellLaptop extends Laptop{



    public static Laptop createLaptop() {
        return new DellLaptop();
    }
}
