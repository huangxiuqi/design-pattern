package com.hxq.command.appliance.ceilingfan;

/**
 * 吊扇设置为中档
 */
public class CeilingFanMediumCommand extends AbstractCeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        super.execute();
        ceilingFan.medium();
    }
}
