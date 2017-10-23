package io.csie.chris.component;

public class CPU implements IComponent {

    @Override
    public void doProcessing() {
        System.out.println("CPU is processing.");
    }
}
