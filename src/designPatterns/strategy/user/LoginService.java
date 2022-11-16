package designPatterns.strategy.user;

import designPatterns.strategy.ServiceStrategy;

import java.util.List;

public class LoginService implements ServiceStrategy {
    @Override
    public void process(Object param) {
        String username = ((List<String>) param).get(0);
        String password = ((List<String>) param).get(1);

        System.out.println("Loggging in " + username + ":" + password);
    }
}
