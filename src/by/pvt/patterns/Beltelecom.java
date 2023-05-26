package by.pvt.patterns;

public class Beltelecom extends Operator implements Observer{
    public Beltelecom(String message) {
        super(message);
    }

    @Override
    public void generate() {
        System.out.println("Звонить всем абонентам и уведомлять об опасности купания");
    }

    @Override
    public void send() {
        System.out.println("Сообщение отправлено от Beltelecom");
    }
}
