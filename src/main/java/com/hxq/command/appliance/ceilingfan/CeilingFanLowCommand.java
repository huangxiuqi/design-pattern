package com.hxq.command.appliance.ceilingfan;

/**
 * 吊扇设置为低档
 */
public class CeilingFanLowCommand extends AbstractCeilingFanCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        super.execute();
        ceilingFan.low();
    }
}
