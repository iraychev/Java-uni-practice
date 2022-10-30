package secondTask;

public class People {

    private String name;
    private String birthdate;

    public People(String name, String birthdate) {
        setName(name);
        setBirthdate(birthdate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
