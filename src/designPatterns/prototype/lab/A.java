package designPatterns.prototype.lab;

public class A implements Cloneable{
    String name;

    public A(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        A hi = new A("hilo");
        A ho = (A) hi.clone();
        System.out.println(ho.name);
    }
}
