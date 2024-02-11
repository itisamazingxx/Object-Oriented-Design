package person;

/**
 * This class illustrates how compound data is represented in Java
 */
public class Person {

    /**
     * Class names in Java always are written in TitleCase,
     * and the field names are always written in camelCase
     */

    private String firstName;
    private String lastName;
    private int yearOfBirth;

    public Person(String firstName, String lastName, int yearOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    
    public int getAge() {
        return 2023 - this.yearOfBirth;
    }
    
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * Returns a string representation of this person with first & last name
     */
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}


