package thirdTask;

public class Laptop extends Device{

    int RAMsize;
    int ROMsize;


    public Laptop(double voltageIn, String CPUModel, int RAMsize, int ROMsize) {
        super(voltageIn, CPUModel);


    }


    public boolean isBetter(Laptop lap) {

        if(this.getRAMsize() < lap.getRAMsize() && this.getROMsize() < lap.getROMsize()) {
            return false;
        }
        else {return true;}

    }

    @Override
    public String toString() {
        return getVoltageIn()+" "+getCPUModel()+" "+getRAMsize()+" "+getROMsize();
    }

    public int getRAMsize() {
        return RAMsize;
    }

    public void setRAMsize(int RAMsize) {
        this.RAMsize = RAMsize;
    }

    public int getROMsize() {
        return ROMsize;
    }

    public void setROMsize(int ROMsize) {
        this.ROMsize = ROMsize;
    }
}
