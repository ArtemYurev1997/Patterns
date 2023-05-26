package by.pvt.patterns;

import java.util.ArrayList;
import java.util.List;

public class Mes implements EventProducer {
    private static Mes mes;
    private  List<Observer> observers;

    public Mes() {

    }

    public static Mes getInstance() {
        if(mes == null) {
            return new Mes();
        }
        return mes;
    }

    @Override
    public void addObserver(Observer observer) {
        if(observers == null) {
            observers = new ArrayList();
        }
        observers.add(observer);
    }

    @Override
    public void print(String message) {
        observers.forEach(observer -> observer.generate());
        observers.forEach(observer -> observer.send());
    }
}
