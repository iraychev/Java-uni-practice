package fourthTask;

public class Multiprocessor {

    int CPUs;
    int cores;
    double tClock;

    public Multiprocessor(int CPUs, int cores, double tClock) {
        setCPUs(CPUs);
        setCores(cores);
        settClock(tClock);
    }


    public double tClockToSingleClock(Multiprocessor multiprocessor) {

        if(multiprocessor.getCores() > 1 && multiprocessor.getCPUs() > 1) {
            return ( 0.8*multiprocessor.getCores() ) * ( 0.8 * multiprocessor.getCPUs() ) * multiprocessor.gettClock();
        }
        else {
            return 0.8 * 1 * 0.8 * 1 * multiprocessor.gettClock();
        }
    }

    public void operationTime() {
        //?

    }

    @Override
    public String toString() {
        return this.getCPUs()+" "+this.getCores()+" "+this.gettClock();
    }

    public int getCPUs() {
        return CPUs;
    }

    public void setCPUs(int CPUsNumber) {
        this.CPUs = CPUsNumber;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double gettClock() {
        return tClock;
    }

    public void settClock(double tClock) {
        this.tClock = tClock;
    }
}
