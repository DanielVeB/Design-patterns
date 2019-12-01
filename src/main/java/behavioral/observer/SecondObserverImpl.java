package behavioral.observer;

public class SecondObserverImpl implements Observer {

    @Override
    public void update() {
        System.out.println("Second behavioral.observer update ...");
    }
}
