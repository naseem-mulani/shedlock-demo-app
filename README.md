# ShedLock

### Problem In hand

- With the help of `@Scheduled` annotation provided by Spring Boot we can easily create scheduled tasks. These when running on a single instance of the application work great.
- But as soon as our application is deployed to a load-balanced environment where multiple instances of the same Spring Boot application are running in parallel, our scheduled jobs are executed in parallel.
- In this case, there is no synchronization that is maintained between the instances and results in simultaneous execution, which might result in inconsistent data or duplicated actions

### Solution - Schedlock

- ShedLock is a distributed lock for scheduled tasks.
- It ensures your scheduled tasks are executed at most once at the same time.
- Once the first Spring Boot instance acquires the lock for a scheduled task, all other instances will skip the task execution.
- As soon as the next task scheduling happens, all nodes will try to get the lock again.
- ShedLock stores information about each scheduled job using persistent storage (so-called LockProvider) that all nodes connect to.(e.g. for RDBMS, MongoDB, DynamoDB, Etcd, …)
- We will have a look at an example using MongoDB

### Reference Documentation

- [Distributed lock for scheduled tasks](https://github.com/lukas-krecan/ShedLock#shedlock)
- [Lock scheduled tasks](https://rieckpil.de/lock-scheduled-tasks-with-shedlock-and-spring-boot/)


(This code base shows a basic implementation of Shedlock using MongoDB as lock provider)
