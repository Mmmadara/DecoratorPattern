package com.company;

public class BaseNotificator implements Notificator {
    private String name;

    BaseNotificator(String name) {
        this.name = name;
    }
    @Override
    public void send() {
        System.out.print("\n" + name +", you will receive message via");
    }
}
