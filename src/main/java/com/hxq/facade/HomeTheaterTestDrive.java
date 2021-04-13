package com.hxq.facade;

import com.hxq.facade.component.*;

/**
 * 家庭影院测试
 */
public class HomeTheaterTestDrive {

    public static void main(String[] args) {

        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLight light = new TheaterLight();
        Popcorn popcorn = new Popcorn();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, screen, light, popcorn);
        homeTheater.watchMovie("变形金刚");
        System.out.println("=====================");
        homeTheater.endMovie();
    }
}
