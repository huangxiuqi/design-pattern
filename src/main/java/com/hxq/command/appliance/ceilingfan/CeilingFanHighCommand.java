package com.hxq.command.appliance.ceilingfan;

/**
 * 吊扇设置为高档
 */
public class CeilingFanHighCommand extends AbstractCeilingFanCommand {

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        super.execute();
        ceilingFan.high();
    }
}
