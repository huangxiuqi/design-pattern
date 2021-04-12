package com.hxq.command;

import com.hxq.command.appliance.ceilingfan.CeilingFan;
import com.hxq.command.appliance.ceilingfan.CeilingFanHighCommand;
import com.hxq.command.appliance.ceilingfan.CeilingFanMediumCommand;
import com.hxq.command.appliance.ceilingfan.CeilingFanOffCommand;
import com.hxq.command.appliance.light.Light;
import com.hxq.command.appliance.light.LightOffCommand;
import com.hxq.command.appliance.light.LightOnCommand;
import com.hxq.command.appliance.stereo.Stereo;
import com.hxq.command.appliance.stereo.StereoOffCommand;
import com.hxq.command.appliance.stereo.StereoOnWithCDCommand;

public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("卧室");
        Light kitchenLight = new Light("厨房");
        Stereo stereo = new Stereo("卧室");
        CeilingFan ceilingFan = new CeilingFan("卧室");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // 一插槽控制卧室灯
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        // 二插槽控制厨房灯
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        // 三插槽控制卧室音响
        remoteControl.setCommand(2, stereoOnWithCD, stereoOffCommand);
        // 四五插槽控制卧室吊扇的不同档位
        remoteControl.setCommand(3, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(4, ceilingFanHigh, ceilingFanOff);

        // 电灯测试
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        // 吊扇测试
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(4);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
