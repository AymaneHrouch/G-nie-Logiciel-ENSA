package designPatterns.prototype;

public class Main {
        public static void main(String[] args) {
            ShapeCache.loadCache();

//            Shape circle = new Circle();
            Shape circle = ShapeCache.getShape("2");
            circle.whoami();
        }
}
