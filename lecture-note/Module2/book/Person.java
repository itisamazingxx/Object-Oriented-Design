package book;

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
    private int age;

    public Person(String firstName, String lastName, int yearOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = yearOfBirth;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getAge() {
        return this.age;
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

    public boolean samePerson(Person other) {
        return this.firstName.equals(other.firstName)
        && this.lastName.equals(other.lastName)
        && this.age == other.age;
    }

}


