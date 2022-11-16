package designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    String name;
    List<Component> subComponents = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Component component) {
        subComponents.add(component);
    }

    public void remove(Component component) {
        subComponents.remove(component);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getSubComponents() {
        return subComponents;
    }

    public void setSubComponents(List<Component> subComponents) {
        this.subComponents = subComponents;
    }


    public void print() {
        for (Component cm : subComponents) {
            if (cm.getClass() == File.class) {
                System.out.println(this.name + "/" + ((File) cm).getName());
            } else {
                ((Folder) cm).print(this.name);
            }
        }
    }

    public void print(String parent) {
        for (Component cm : subComponents) {
            String newParent = parent + "/" + this.name;
            if (cm.getClass() == File.class) {
                System.out.println(newParent + "/" + ((File) cm).getName());
            } else {
                ((Folder) cm).print(newParent);
            }
        }
    }
}
