package com.hxq.command.appliance.ceilingfan;

/**
 * 吊扇设置为关闭
 */
public class CeilingFanOffCommand extends AbstractCeilingFanCommand {

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        super.execute();
        ceilingFan.off();
    }
}
