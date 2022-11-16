package designPatterns.factoryMethod;

public class WebDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WebButton();
    }

    @Override
    public void render() {
        System.out.println(super.text);
        Button btn = this.createButton();
        btn.render();
    }
}
