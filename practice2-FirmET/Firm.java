public class Firm {
    String name;
    String foundingDate;
    String bulstat;

    Firm(String name, String foundingDate, String bulstat) {
        setName(name);
        setFoundingDate(foundingDate);
        setBulstat(bulstat);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFoundingDate() {
        return foundingDate;
    }
    public void setFoundingDate(String foundingDate) {
        this.foundingDate = foundingDate;
    }

    public String getBulstat() {
        return bulstat;
    }
    public void setBulstat(String bulstat) {
        if(bulstat.length() == 10) this.bulstat = bulstat;
        else System.out.println("Invalid bulstat");
    }

}
