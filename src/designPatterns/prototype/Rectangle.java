package designPatterns.prototype;

public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    public void whoami() {
        System.out.println("hello there im a riktongle");
    }
}