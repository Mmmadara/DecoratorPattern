package com.company;

public class EmailDecorator extends Decorator{
    EmailDecorator(Notificator notificator) {
        super(notificator);
    }

    @Override
    public void send(){
        super.send();
        extra();
    }

    @Override
    public void extra() {
        System.out.print(" Email,");
    }
}
