package by.pvt.patterns;

public interface EventProducer {
    void addObserver(Observer observer);
    void print(String message);
}
