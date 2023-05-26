package by.pvt.patterns;

public class Mts extends Operator implements Observer{
    public Mts(String message) {
        super(message);
    }

    @Override
    public void generate() {
        System.out.println("Отправлять уведомление об опасности купания на все смартфоны");
    }

    @Override
    public void send() {
        System.out.println("Сообщение отправлено от Mts");
    }
}
