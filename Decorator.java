package com.company;

public abstract class Decorator implements Notificator {
    protected Notificator wrapee;
    Decorator(Notificator notificator) {
        wrapee = notificator;
    }
    @Override
    public void send(){
        wrapee.send();
    }

    public abstract void extra();
}
