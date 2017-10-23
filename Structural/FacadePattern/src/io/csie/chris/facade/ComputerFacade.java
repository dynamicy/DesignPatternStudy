package io.csie.chris.facade;

import io.csie.chris.component.CPU;
import io.csie.chris.component.HardDrive;
import io.csie.chris.component.Memory;

public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void run() {
        cpu.doProcessing();
        memory.doProcessing();
        hardDrive.doProcessing();
    }
}
