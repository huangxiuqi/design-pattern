package com.hxq.command.appliance.light;

import com.hxq.command.command.Command;

/**
 * 开灯命令
 */
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
