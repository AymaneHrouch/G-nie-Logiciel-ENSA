package designPatterns.decorator;

public class RedButton {
    Button btn = new Button();

    public String toString() {
        return "Red Button: " + btn.text;
    }
}
