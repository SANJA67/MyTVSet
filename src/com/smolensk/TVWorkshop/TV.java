package com.smolensk.TVWorkshop;

import com.smolensk.TV.LGTV;
import com.smolensk.TV.PanasonicTV;
import com.smolensk.TV.remoteController.Tuning;

import java.util.ArrayList;
import java.util.List;

public class TV {

    public static void main(String[] args) {
        Tuning lgtv = new LGTV();

        lgtv.turnOn();

        PanasonicTV panasonicTV = new PanasonicTV();

        panasonicTV.pressEight();
        // В чём "счастье" от записи в строке 10, если мы не можем,
        // оборотится к методам класса, а если берем запись в строке 14
        // то обращаемся и к методам класса и к методам интерфейса?

        // Пытался плясать от записи,
        List<Object> list = new ArrayList<>(); // понимание не зашло.
        // Если допустить что ArrayList имплементирует другие интерфейсы и имеет свои методы,
        // то проще писать:
        ArrayList<Object> arrayList = new ArrayList<>();







    }
}
