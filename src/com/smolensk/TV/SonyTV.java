package com.smolensk.TV;

import com.smolensk.TV.remoteController.Tuning;

public class SonyTV implements Tuning {
    @Override
    public void turnOn() {
        System.out.println("включил телевизор Sony");
    }

    @Override
    public void turnOff() {
        System.out.println("выключил телевизор Sony");
    }

    @Override
    public void makeLouder() {
        System.out.println("сделал громче телевизор Sony");
    }

    @Override
    public void makeQuieter() {
        System.out.println("сделал тише телевизор Sony");
    }

    @Override
    public void pressOne() {
        System.out.println("нажал кнопку один в телевизоре Sony");
    }

    @Override
    public void pressTwo() {
        System.out.println("нажал кнопку два в телевизоре Sony");
    }

    @Override
    public void pressThree() {
        System.out.println("нажал кнопку три в телевизоре Sony");
    }

    @Override
    public void pressFour() {
        System.out.println("нажал кнопку четыре в телевизоре Sony");
    }

    @Override
    public void pressFive() {
        System.out.println("нажал кнопку пять в телевизоре Sony");
    }

    @Override
    public void pressSix() {
        System.out.println("нажал кнопку шесть в телевизоре Sony");
    }

    @Override
    public void pressSeven() {
        System.out.println("нажал кнопку семь в телевизоре Sony");
    }

    @Override
    public void pressEight() {
        System.out.println("нажал кнопку восемь в телевизоре Sony");
    }

    @Override
    public void pressNine() {
        System.out.println("нажал кнопку девять в телевизоре Sony");
    }

    @Override
    public void pressZero() {
        System.out.println("нажал кнопку десять в телевизоре Sony");
    }
}
