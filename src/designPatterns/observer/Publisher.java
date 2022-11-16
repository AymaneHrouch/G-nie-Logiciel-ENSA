package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String name;
    List<Subscriber> subscribers = new ArrayList<>();

    public Publisher(String name) {
        this.name = name;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for(Subscriber subscriber: subscribers) {
            subscriber.update();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifySubscribers();
    }
}
