package behavioral.observer;

public class FirstObserverImpl implements Observer {

    @Override
    public void update() {
        System.out.println("First Observer update :D ");
    }
}
