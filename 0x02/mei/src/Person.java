import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private int birthDate;
    private boolean anotherCompanyOwner, Pensioner, PublicServer;
    private float salary;

    public Person(String name, String surname, int birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        Pensioner = pensioner;
        PublicServer = publicServer;
    }

 /*  public Person() {
    }*/

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return Pensioner;
    }

    public boolean isPublicServer() {
        return PublicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        Pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        PublicServer = publicServer;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String fullName() {
        return getName() + " " + getSurname();
    }

    public double calculateYearlySalary() {
        return getSalary() * 12;
    }

    public boolean isMEI() {
        LocalDate current_date = LocalDate.now();

        return (getSalary() * 12 < 130000) &&
                (current_date.getYear() - getBirthDate() > 18) &&
                isAnotherCompanyOwner() == false &&
                isPensioner() == false &&
                isPublicServer() == false;

    }


}
