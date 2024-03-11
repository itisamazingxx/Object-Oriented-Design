# Elevator system - OO Design
## Description
- The building currently has only one elevator, and this building has n floors
- Each elevator has three states: up, down, idle
- When the elevator moves in one direction, the reverse floor button cannot be pressed in the elevator


要实现的功能：
内部（电梯内request）等待电梯传送
外部（电梯外request）

```mermaid
classDiagram
    class Request 
    <<abstract>> Request
    Request: // stores specific request of client

    class ExternalRequest
    ExternalRequest: // Starting from request

    ExternalRequest --|> Request

    class InternalRequest
    InternalRequest: // 

    InternalRequest --|> Request

    ElevatorSystem ..> Request

    class ElevatorSystem
    ElevatorSystem: -List<Elevator> elevators 
    ElevatorSystem: -Strategy strategy
    ElevatorSystem: +handleExternalRequest()
    ElevatorSystem: +setStrategy(strategy)

    class Elevator

    ElevatorSystem --> Elevator
    ElevatorSystem --> Strategy

    class Strategy
    <<interface>> Strategy
    Strategy: +handleRequest(request, elevators)

    class PeakHourStrategy

    PeakHourStrategy ..|> Strategy

    class ElevatorButton
    ElevatorButton: -int floor
    ElevatorButton: -Elevator elevator 
    ElevatorButton: -pressElevatoraButton()
    ElevatorButton: // handle internal request here
    ElevatorButton ..> InternalRequest
    ElevatorButton --> ElevatorSystem
```