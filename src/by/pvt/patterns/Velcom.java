package by.pvt.patterns;

public class Velcom extends Operator implements Observer {
    public Velcom(String message) {
        super(message);
    }

    @Override
    public void generate() {
        System.out.println("Отправлять смски об опасности купания");
    }

    @Override
    public void send() {
        System.out.println("Сообщение отправлено от Velcom");
    }
}
