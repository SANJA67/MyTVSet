package com.smolensk.TV;

import com.smolensk.TV.remoteController.Tuning;

public class SamsungTV implements Tuning {
    @Override
    public void turnOn() {
        System.out.println("включил телевизор Samsung");
    }

    @Override
    public void turnOff() {
        System.out.println("выключил телевизор Samsung");
    }

    @Override
    public void makeLouder() {
        System.out.println("сделал громче телевизор Samsung");
    }

    @Override
    public void makeQuieter() {
        System.out.println("сделал тише телевизор Samsung");
    }

    @Override
    public void pressOne() {
        System.out.println("нажал кнопку один в телевизоре Samsung");
    }

    @Override
    public void pressTwo() {
        System.out.println("нажал кнопку два в телевизоре Samsung");
    }

    @Override
    public void pressThree() {
        System.out.println("нажал кнопку три в телевизоре Samsung");
    }

    @Override
    public void pressFour() {
        System.out.println("нажал кнопку четыре в телевизоре Samsung");
    }

    @Override
    public void pressFive() {
        System.out.println("нажал кнопку пять в телевизоре Samsung");
    }

    @Override
    public void pressSix() {
        System.out.println("нажал кнопку шесть в телевизоре Samsung");
    }

    @Override
    public void pressSeven() {
        System.out.println("нажал кнопку семь в телевизоре Samsung");
    }

    @Override
    public void pressEight() {
        System.out.println("нажал кнопку восемь в телевизоре Samsung");
    }

    @Override
    public void pressNine() {
        System.out.println("нажал кнопку девять в телевизоре Samsung");
    }

    @Override
    public void pressZero() {
        System.out.println("нажал кнопку десять в телевизоре Samsung");
    }
}
