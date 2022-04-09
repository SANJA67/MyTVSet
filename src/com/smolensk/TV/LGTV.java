package com.smolensk.TV;

import com.smolensk.TV.remoteController.Tuning;

public class LGTV implements Tuning {
    @Override
    public void turnOn() {
        System.out.println("включил телевизор LG");
    }

    @Override
    public void turnOff() {
        System.out.println("выключил телевизор LG");
    }

    @Override
    public void makeLouder() {
        System.out.println("сделал громче телевизор LG");
    }

    @Override
    public void makeQuieter() {
        System.out.println("сделал тише телевизор LG");
    }

    @Override
    public void pressOne() {
        System.out.println("нажал кнопку один в телевизоре LG");
    }

    @Override
    public void pressTwo() {
        System.out.println("нажал кнопку два в телевизоре LG");
    }

    @Override
    public void pressThree() {
        System.out.println("нажал кнопку три в телевизоре LG");
    }

    @Override
    public void pressFour() {
        System.out.println("нажал кнопку четыре в телевизоре LG");
    }

    @Override
    public void pressFive() {
        System.out.println("нажал кнопку пять в телевизоре LG");
    }

    @Override
    public void pressSix() {
        System.out.println("нажал кнопку шесть в телевизоре LG");
    }

    @Override
    public void pressSeven() {
        System.out.println("нажал кнопку семь в телевизоре LG");
    }

    @Override
    public void pressEight() {
        System.out.println("нажал кнопку восемь в телевизоре LG");
    }

    @Override
    public void pressNine() {
        System.out.println("нажал кнопку девять в телевизоре LG");
    }

    @Override
    public void pressZero() {
        System.out.println("нажал кнопку десять в телевизоре LG");
    }
}
