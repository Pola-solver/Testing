
import java.time.LocalDate;

abstract class Person {
    private String FirstName;
    private String LastName;

    private String gender;

    public Person(String FirstName , String LastName  , String gender){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.gender=gender;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getLastName() {
        return LastName;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}