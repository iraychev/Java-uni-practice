public class FirmET extends Firm {

    String owner;
    double startCapital;
    double currentCapital;

    FirmET(String name, String foundingDate, String bulstat, String owner, double startCapital, double currentCapital) {
        //super(String name, String foundingDate, String bulstat);
        super(name, foundingDate, bulstat);

        setOwner(owner);
        setStartCapital(startCapital);
        setCurrentCapital(currentCapital);
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner= owner;
    }

    public double getCurrentCapital() {
        return currentCapital;
    }
    public void setCurrentCapital(double currentCapital) {
        this.currentCapital = currentCapital;
    }

    public void setStartCapital(double startCapital) {
        this.startCapital = startCapital;
    }
    public double getStartCapital() {
        return startCapital;
    }

    public double winningsToDate() {
        return getCurrentCapital() - getStartCapital();
    }

    public static void displayData(FirmET firma) {
        System.out.println(firma.getCurrentCapital());
        System.out.println(firma.getName());
        System.out.println(firma.getOwner());
        System.out.println(firma.getBulstat());
    }

    public static void main(String[] args) {

        FirmET firm1 = new FirmET("Mercedes", "28.05.1926", "0123456789", "Lewis Hamilton", 1200.37, 285.737);
        FirmET firm2 = new FirmET("abc", "9:11", "0123456789", "Ceci", 1200.37, 285.737);

        FirmET.displayData(firm1);
        FirmET.displayData(firm2);
        System.out.println(firm1.winningsToDate());

    }
}
