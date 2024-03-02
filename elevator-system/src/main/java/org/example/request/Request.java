package org.example.request;

/**
 * This class represent an abstract class of all kinds of request
 */
public abstract class Request {
    protected int floor;
    public Request(int floor) {
        this.floor = floor;
    }
}
