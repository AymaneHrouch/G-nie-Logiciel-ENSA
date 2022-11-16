package designPatterns.strategy.etudiant;

import designPatterns.strategy.ServiceStrategy;

public class AddService implements ServiceStrategy {
    @Override
    public void process(Object param) {
        String student = (String) param;
        System.out.println("Adding student " + student);
    }
}
