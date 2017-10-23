package io.csie.chris.component;

public class HardDrive implements IComponent {

    @Override
    public void doProcessing() {
        System.out.println("Hard drive is processing.");
    }
}
