package designPatterns.composite;

public class File implements Component {
    String name;

    File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}