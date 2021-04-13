package com.hxq.facade;

import com.hxq.facade.component.*;

/**
 * 家庭影院外观类
 */
public class HomeTheaterFacade {

    private final Amplifier amp;
    private final DvdPlayer dvd;
    private final Projector projector;
    private final Screen screen;
    private final TheaterLight light;
    private final Popcorn popcorn;

    public HomeTheaterFacade(Amplifier amp,
                             DvdPlayer dvd,
                             Projector projector,
                             Screen screen,
                             TheaterLight light,
                             Popcorn popcorn) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
        this.light = light;
        this.popcorn = popcorn;
    }

    public void watchMovie(String movie) {
        System.out.println("准备开始看电影");

        popcorn.on();
        popcorn.pop();
        light.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("电影看完了，准备关闭家庭影院");
        popcorn.off();
        light.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
