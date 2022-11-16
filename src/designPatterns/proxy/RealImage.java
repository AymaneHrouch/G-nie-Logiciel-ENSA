package designPatterns.proxy;

public class RealImage implements Image{

    String name = "unnamed";

    RealImage() {
        load();
    }

    public void load() {
        System.out.println("Loading image...");
    }

    @Override
    public void display() {
        System.out.println("Displaying Image");
    }
}
