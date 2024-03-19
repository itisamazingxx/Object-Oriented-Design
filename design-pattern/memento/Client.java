package memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state #1: awesome world testing");
        careTaker.add(originator.saveStateMemento());

        originator.setState("state #2: sading..");
        careTaker.add(originator.saveStateMemento());

        System.out.println("Current state: " + originator.getState());

        // Roll back to state 1
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("After recovering, current state: " + originator.getState());
    }
    
}
