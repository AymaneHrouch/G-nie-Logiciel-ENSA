package designPatterns.strategy;

import designPatterns.strategy.etudiant.AddService;
import designPatterns.strategy.etudiant.DeleteService;
import designPatterns.strategy.user.LoginService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ServiceContext context = new ServiceContext(new LoginService());
        context.execute(List.of("aymanehrouch", "hard_to_guess_password"));

        context.setStrategy(new AddService());
        context.execute("A NEW STUDENT");

        context.setStrategy(new DeleteService());
        context.execute(3);
    }
}
