package com.smolensk.TV;

import com.smolensk.TV.remoteController.Tuning;

public class VityazTV implements Tuning {
    @Override
    public void turnOn() {
        System.out.println("включил телевизор Vityaz");
    }

    @Override
    public void turnOff() {
        System.out.println("выключил телевизор Vityaz");
    }

    @Override
    public void makeLouder() {
        System.out.println("сделал громче телевизор Vityaz");
    }

    @Override
    public void makeQuieter() {
        System.out.println("сделал тише телевизор Vityaz");
    }

    @Override
    public void pressOne() {
        System.out.println("нажал кнопку один в телевизоре Vityaz");
    }

    @Override
    public void pressTwo() {
        System.out.println("нажал кнопку два в телевизоре Vityaz");
    }

    @Override
    public void pressThree() {
        System.out.println("нажал кнопку три в телевизоре Vityaz");
    }

    @Override
    public void pressFour() {
        System.out.println("нажал кнопку четыре в телевизоре Vityaz");
    }

    @Override
    public void pressFive() {
        System.out.println("нажал кнопку пять в телевизоре Vityaz");
    }

    @Override
    public void pressSix() {
        System.out.println("нажал кнопку шесть в телевизоре Vityaz");
    }

    @Override
    public void pressSeven() {
        System.out.println("нажал кнопку семь в телевизоре Vityaz");
    }

    @Override
    public void pressEight() {
        System.out.println("нажал кнопку восемь в телевизоре Vityaz");
    }

    @Override
    public void pressNine() {
        System.out.println("нажал кнопку девять в телевизоре Vityaz");
    }

    @Override
    public void pressZero() {
        System.out.println("нажал кнопку десять в телевизоре Vityaz");
    }
}
