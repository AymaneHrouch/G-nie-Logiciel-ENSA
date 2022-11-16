package designPatterns.proxy;

public class ProxyImage implements Image {
    private Image image = null;
    @Override
    public void display() {
        if(image == null) {
            image = new RealImage();
        }

        image.display();
    }
}
