package designPatterns.prototype;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    public void whoami() {
        System.out.println("hello there im a squaaaaaaaaaaaaaaaare");
    }
}