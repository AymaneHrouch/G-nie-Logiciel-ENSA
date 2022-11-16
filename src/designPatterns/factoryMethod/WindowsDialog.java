package designPatterns.factoryMethod;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public void render() {
        System.out.println(super.text);
        Button btn = this.createButton();
        btn.render();
    }
}
