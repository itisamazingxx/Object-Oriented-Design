package org.example;

import org.example.elevator.Elevator;
import org.example.request.Request;
import org.example.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents elevator operation management system
 */
public class ElevatorSystem {
    private List<Elevator> elevators;
    private Strategy strategy;

    public ElevatorSystem(Strategy strategy) {
        this.elevators = new ArrayList<>();
        this.strategy = strategy;
    }

    public void handleRequest(Request request) {
        // First step:
        // Test时首先new新的request（模仿client指令）
        // 首先根据elevators整个系统下的strategy分配电梯
        strategy.handleRequest(request);
    }
}
