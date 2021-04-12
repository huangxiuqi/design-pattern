package com.hxq.command.appliance.light;

import com.hxq.command.command.Command;

/**
 * 关灯命令
 */
public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light= light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
