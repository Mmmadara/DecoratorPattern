package com.company;

public class TgDecorator extends Decorator{
    TgDecorator(Notificator notificator) {
        super(notificator);
    }

    @Override
    public void send(){
        super.send();
        extra();
    }

    @Override
    public void extra() {
        System.out.print(" Telegram,");
    }
}
