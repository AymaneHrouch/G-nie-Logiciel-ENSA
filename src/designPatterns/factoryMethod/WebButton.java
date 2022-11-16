package designPatterns.factoryMethod;

public class WebButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Click me!</button>");
    }
}
