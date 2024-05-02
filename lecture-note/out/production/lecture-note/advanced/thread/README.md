# Process (进程)

A process is an execution of a program (a running program). The operating system allocates operational space for each process. A program becomes a process when it runs. Processes are dynamic, having their own cycle of creation, existence, and termination.

进程是程序的执行（正在运行的程序）。操作系统为每个进程分配操作空间。程序运行时变成进程。进程是动态的，具有自己的创建、存在和终止的周期。

# Thread (线程)

A thread is created by a process and is an entity of the process. A process can have multiple threads. For example, launching Thunder (the Thunder software is a process), different download tasks represent different threads. All threads must end before the process can end.

线程由进程创建，是进程的实体。一个进程可以有多个线程。例如，启动迅雷（迅雷软件是一个进程），不同的下载任务代表不同的线程。所有线程都结束后才会结束进程。

# Thread-related Concepts (线程相关概念)

1. **Single-threading (单线程)**: At any given moment, only one thread is allowed to execute.
   
   同一时刻只允许执行一个线程。

2. **Multi-threading (多线程)**: At the same moment, multiple threads can be allowed (e.g., chat software, where you can chat with many people). A single program can run multiple different execution paths or threads simultaneously.
   
   同一个时刻可以允许多个线程（例如，聊天软件，可以与很多人聊天）。单个程序中可以同时运行多个不同的执行路径或线程。

3. **Concurrency (并发)**: At the same moment, different tasks take turns proceeding. The system's ability to handle multiple tasks (Concurrency is achieved by a single-core CPU through interleaving).
   
   同一个时刻，不同的任务交替进行。系统能够处理多个任务的能力（单核CPU实现的是并发）。
   单核CPU同一个时刻只能有一个Process正在运行, 但可以有多个线程

4. **Parallelism (并行)**: At the same moment, multiple tasks proceed simultaneously. Parallelism can include concurrency but is enabled by multi-core CPUs.
   
   同一个时刻，多个任务同时进行，多核CPU可以实现并行。并行中可以包含并发。

## Java Thread Starting Mechanism (Java线程启动机制)

In Java, calling `class.start()` to invoke `start0()` does not immediately execute the thread. It merely changes the thread to a runnable state.

在Java中，调用`class.start()`以调用`start0()`并不会马上执行线程，只是将线程变成了可运行状态。

在java中，class是单继承的，如果在某些情况下一个类已经继承了另一个类，如何继承thread类来创建线程？
- 可以通过实现Runnable接口来创建线程

在Java中，主线程与子线程（或说任何其他线程）运行于同一个进程内，但它们的生命周期是独立的。这意味着主线程的结束并不会自动导致程序中其他线程的结束，反之亦然。
