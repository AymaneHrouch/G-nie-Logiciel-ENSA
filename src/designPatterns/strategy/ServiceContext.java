package designPatterns.strategy;


public class ServiceContext {
    ServiceStrategy strategy;

    public ServiceContext(){}

    public ServiceContext(ServiceStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ServiceStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(Object param) {
        strategy.process(param);
    }
}
