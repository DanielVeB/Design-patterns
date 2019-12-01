package observer;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Observer pattern\n");

        List<Observer> observers = new LinkedList<>();
        observers.add(() -> System.out.println("Anonymous observer update ..."));

        Subject subject = new Subject(observers);
        SecondObserverImpl secondObserver = new SecondObserverImpl();

        subject.addObserver(new FirstObserverImpl());
        subject.addObserver(secondObserver);

        subject.notifyObservers();

        System.out.println("\nRemove second observator");
        subject.deleteObserver(secondObserver);

        subject.notifyObservers();
    }
}
