package thirdTask;

public class Device {

    double voltageIn;
    String CPUModel;

    public Device(double voltageIn, String CPUModel) {
        setCPUModel(CPUModel);
        setVoltageIn(voltageIn);
    }




    public void turnON() {

    }

    public void turnOFF() {


    }

    public double getVoltageIn() {
        return voltageIn;
    }

    public void setVoltageIn(double voltageIn) {
        this.voltageIn = voltageIn;
    }

    public String getCPUModel() {
        return CPUModel;
    }

    public void setCPUModel(String CPUModel) {
        this.CPUModel = CPUModel;
    }
}
