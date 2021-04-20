package com.hxq.compound.combining;

import com.hxq.compound.combining.observer.Observer;
import com.hxq.compound.combining.observer.QuackObservable;

public class QuackLogist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("呱呱叫学家：" + duck + "刚刚叫了");
    }
}
