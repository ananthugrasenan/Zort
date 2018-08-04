import java.util.Date;

public class Person {
    String ssn;
    Date dateOfBirth;
    String firstName;
    String lastName;
    Double heightIn;
    Double weightLb;

    public Person(String ssn, Date dateOfBirth, String firstName, String lastName, Double heightIn, Double weightLb) {
        this.ssn = ssn;
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightIn = heightIn;
        this.weightLb = weightLb;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getHeightIn() {
        return heightIn;
    }

    public void setHeightIn(Double heightIn) {
        this.heightIn = heightIn;
    }

    public Double getWeightLb() {
        return weightLb;
    }

    public void setWeightLb(Double weightLb) {
        this.weightLb = weightLb;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

}
