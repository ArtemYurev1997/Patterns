package by.pvt.patterns;

public class Main {
    public static void main(String[] args) {
        Observer observer1 = new Velcom("Velcom");
        Observer observer2 = new Mts("Mts");
        Observer observer3 = new Beltelecom("Beltelecom");
        Observer observer4 = new Life("Life");
        Mes mes = Mes.getInstance();
        mes.addObserver(observer1);
        mes.addObserver(observer2);
        mes.addObserver(observer3);
        mes.addObserver(observer4);
        mes.print("UUUU");
    }
}
