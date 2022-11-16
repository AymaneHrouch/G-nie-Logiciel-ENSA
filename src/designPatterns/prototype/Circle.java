package designPatterns.prototype;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

    @Override
    public void whoami() {
        System.out.println("hello there im a circle");
    }

}
