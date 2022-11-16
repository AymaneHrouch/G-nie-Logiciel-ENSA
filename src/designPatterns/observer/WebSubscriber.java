package designPatterns.observer;

public class WebSubscriber implements Subscriber {
    private String name;
    private Publisher subject;

    public WebSubscriber(String name, Publisher subject) {
        this.name = name;
        this.subject = subject;
        this.subject.subscribe(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Publisher getSubject() {
        return subject;
    }

    public void setSubject(Publisher subject) {
        this.subject.unsubscribe(this);
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.print("<p>");
        System.out.print("Beep Beep. Hello " + name +
                " your publisher new name is " + subject.getName());
        System.out.print("</p>");
    }
}
