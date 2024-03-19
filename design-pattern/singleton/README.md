## Singleton Design Pattern

This pattern employs a specific approach to ensure that within the entire software system, there can only be one instance of a particular class. Additionally, this class provides a single method to acquire its object instance.

**Resource Sharing**: In some cases, repeated creation and destruction of specific resources, such as database connection pools or thread pools, may lead to performance issues or resource wastage. The singleton pattern ensures that these resources are created only once and shared throughout the lifecycle of the application.

**State Sharing**: The state of certain objects needs to be globally shared within the application, such as application configurations or user login information. The singleton pattern ensures that there is only one instance of these states, and it remains consistent throughout the application.

1. Eager Initialization:
Instantiation is completed at the time of class loading, which avoids thread synchronization issues.
Disadvantage: It may lead to memory waste.