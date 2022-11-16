package designPatterns.observer;

public class MobileSubscriber implements Subscriber {
    private String name;
    private Publisher subject;

    public MobileSubscriber(String name, Publisher subject) {
        this.name = name;
        this.subject = subject;
        this.subject.subscribe(this);
    }

    public MobileSubscriber() {
    }

    public void setSubject(Publisher subject) {
        this.subject.unsubscribe(this);
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("Beep Boop. Hello " + name +
                " your publisher new name is " + subject.getName());
    }
}
