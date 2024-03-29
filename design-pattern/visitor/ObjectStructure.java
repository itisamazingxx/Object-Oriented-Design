import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

    private List<Person> persons = new LinkedList<Person>();

    public void attach(Person person) {
        persons.add(person);
    }

    public void detach(Person person) {
        persons.remove(person);
    }

    /**
     * Show rating result
     */
    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
    
}
