package com.smolensk.TV;

import com.smolensk.TV.remoteController.Tuning;

public class PanasonicTV implements Tuning {
    @Override
    public void turnOn() {
        System.out.println("включил телевизор Panasonic");
    }

    @Override
    public void turnOff() {
        System.out.println("выключил телевизор Panasonic");
    }

    @Override
    public void makeLouder() {
        System.out.println("сделал громче телевизор Panasonic");
    }

    @Override
    public void makeQuieter() {
        System.out.println("сделал тише телевизор Panasonic");
    }

    @Override
    public void pressOne() {
        System.out.println("нажал кнопку один в телевизоре Panasonic");
    }

    @Override
    public void pressTwo() {
        System.out.println("нажал кнопку два в телевизоре Panasonic");
    }

    @Override
    public void pressThree() {
        System.out.println("нажал кнопку три в телевизоре Panasonic");
    }

    @Override
    public void pressFour() {
        System.out.println("нажал кнопку четыре в телевизоре Panasonic");
    }

    @Override
    public void pressFive() {
        System.out.println("нажал кнопку пять в телевизоре Panasonic");
    }

    @Override
    public void pressSix() {
        System.out.println("нажал кнопку шесть в телевизоре Panasonic");
    }

    @Override
    public void pressSeven() {
        System.out.println("нажал кнопку семь в телевизоре Panasonic");
    }

    @Override
    public void pressEight() {
        System.out.println("нажал кнопку восемь в телевизоре Panasonic");
    }

    @Override
    public void pressNine() {
        System.out.println("нажал кнопку девять в телевизоре Panasonic");
    }

    @Override
    public void pressZero() {
        System.out.println("нажал кнопку десять в телевизоре Panasonic");
    }
}
