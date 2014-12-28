package tw.hacker.java;

public class ComputerFacade
{
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade()
    {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void run()
    {
        cpu.doProcessing();
        memory.doProcessing();
        hardDrive.doProcessing();
    }
}
