package org.example.request;

import org.example.util.Direction;

public class ExternalRequest extends Request {
    private Direction direction;

    public ExternalRequest(int floor, Direction direction) {
        super(floor);
        this.direction = direction;
    }
}
