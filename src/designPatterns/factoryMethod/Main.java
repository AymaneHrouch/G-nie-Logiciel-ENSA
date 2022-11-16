package designPatterns.factoryMethod;

public class Main {
    public static void main(String[] args) {
        String thisOs = "asdqfsqd";
        Dialog dialog;

        if(thisOs == "Web") {
            dialog = new WebDialog();
        } else {
            dialog = new WindowsDialog();
        }

        dialog.render();
    }
}
