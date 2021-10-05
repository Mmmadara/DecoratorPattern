package com.company;

public class SmsDecorator extends Decorator {
    SmsDecorator(Notificator notificator) {
        super(notificator);
    }

    @Override
    public void send(){
        super.send();
        extra();
    }

    @Override
    public void extra() {
        System.out.print(" Sms,");
    }
}
