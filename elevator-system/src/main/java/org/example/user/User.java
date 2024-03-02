package org.example.user;

import org.example.elevator.Elevator;
import org.example.request.InternalRequest;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public boolean goingUp() {

    }
    public boolean goingDown() {

    }
    public boolean pressButton(int floor) {
        InternalRequest request = new InternalRequest(floor);
        Elevator elevator
    }
}
