package com.hxq.command.appliance.stereo;

import com.hxq.command.command.Command;

/**
 * 关音响命令
 */
public class StereoOffCommand implements Command {

    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {

    }
}
