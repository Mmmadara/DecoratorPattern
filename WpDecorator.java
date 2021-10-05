package com.company;

public class WpDecorator extends Decorator {
    WpDecorator(Notificator notificator) {
        super(notificator);
    }

    @Override
    public void send(){
        super.send();
        extra();
    }

    @Override
    public void extra() {
        System.out.print(" WhatsApp,");
    }
}
