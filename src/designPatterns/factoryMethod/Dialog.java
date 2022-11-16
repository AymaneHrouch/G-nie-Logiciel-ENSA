package designPatterns.factoryMethod;

public abstract class Dialog {

    String text = "This is a dialog, press OK to continue \n\n";
    public abstract Button createButton();
    public abstract void render();
}
