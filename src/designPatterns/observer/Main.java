package designPatterns.observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("DEFAULT NAME");
        MobileSubscriber mobileSubscriber = new MobileSubscriber("AYMANE PHONE", publisher);
        WebSubscriber webSubscriber = new WebSubscriber("AYMANE BROWSER", publisher);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please write the new name of the publisher: ");
        String newName = sc.nextLine();
        publisher.setName(newName);
    }
}