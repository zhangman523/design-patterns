package structuralDesignPatterns.bridge;

import structuralDesignPatterns.bridge.devices.Device;
import structuralDesignPatterns.bridge.devices.Radio;
import structuralDesignPatterns.bridge.devices.Tv;
import structuralDesignPatterns.bridge.remotes.AdvancedRemote;
import structuralDesignPatterns.bridge.remotes.BasicRemote;

public class BridgeDemo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        advancedRemote.power();
    }
}
