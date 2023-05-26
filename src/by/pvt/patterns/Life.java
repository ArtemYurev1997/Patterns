package by.pvt.patterns;

public class Life extends Operator implements Observer{
    public Life(String message) {
        super(message);
    }

    @Override
    public void generate() {
        System.out.println("Отправлять сообщения чере каждые 10 минут об опасности купания");
    }

    @Override
    public void send() {
        System.out.println("Сообщение отправлено от Life");
    }

}
