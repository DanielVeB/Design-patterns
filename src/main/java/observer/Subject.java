package observer;

import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject(List<Observer> observers){
        this.observers = observers;
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    public void deleteObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer: this.observers){
            observer.update();
        }
    }
}
