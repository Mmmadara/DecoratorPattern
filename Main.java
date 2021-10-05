package com.company;

public class Main {
    public static void main(String[] args) {
        Notificator nt1 = new WpDecorator(new TgDecorator(new BaseNotificator("Kaysar")));
        nt1.send();

        Notificator nt2 = new SmsDecorator(new WpDecorator(new BaseNotificator("Dias")));
        nt2.send();

        Notificator nt3 = new TgDecorator(new SmsDecorator(new BaseNotificator("Nurtleu")));
        nt3.send();
    }
}
