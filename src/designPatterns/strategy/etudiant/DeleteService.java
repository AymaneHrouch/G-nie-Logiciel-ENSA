package designPatterns.strategy.etudiant;

import designPatterns.strategy.ServiceStrategy;

public class DeleteService implements ServiceStrategy {
    @Override
    public void process(Object param) {
        int id = (int) param;
        System.out.println("Removing user with id=" + id);
    }
}
