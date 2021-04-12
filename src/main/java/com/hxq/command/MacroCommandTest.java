package com.hxq.command;

import com.hxq.command.appliance.ceilingfan.CeilingFan;
import com.hxq.command.appliance.ceilingfan.CeilingFanMediumCommand;
import com.hxq.command.appliance.ceilingfan.CeilingFanOffCommand;
import com.hxq.command.appliance.light.Light;
import com.hxq.command.appliance.light.LightOffCommand;
import com.hxq.command.appliance.light.LightOnCommand;
import com.hxq.command.appliance.stereo.Stereo;
import com.hxq.command.appliance.stereo.StereoOffCommand;
import com.hxq.command.appliance.stereo.StereoOnWithCDCommand;
import com.hxq.command.command.Command;
import com.hxq.command.command.MacroCommand;

public class MacroCommandTest {

    public static void main(String[] args) {
        // 宏命令测试
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("卧室");
        Stereo stereo = new Stereo("卧室");
        CeilingFan ceilingFan = new CeilingFan("卧室");

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn = { lightOn, stereoOnWithCD, ceilingFanMedium };
        Command[] partyOff = { lightOff, stereoOff, ceilingFanOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("----- 打开宏命令 -----");
        remoteControl.onButtonWasPushed(0);
        System.out.println("----- 关闭宏命令 -----");
        remoteControl.offButtonWasPushed(0);

        System.out.println("----- 重新打开 -----");
        remoteControl.onButtonWasPushed(0);
        System.out.println("----- 撤销 -----");
        remoteControl.undoButtonWasPushed();

    }
}
