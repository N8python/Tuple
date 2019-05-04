# Tuple
A immutable implementation of a Bi-Tuple in Java.

# Tuple
A generic class that takes two different parameters:
```java
    Tuple<Integer, Integer> myTuple = new Tuple<>(3, 5);
```
You can access each of the tuple's values with:
```java
myTuple.v0() // The first value
myTuple.v1() // The second value
```
 # Adding tuples
 Two tuples can be added together to create a new tuple. Functions must be provided for adding each one of the tuple's values. For example:
 ```java
    Tuple<Integer, Integer> myTuple = new Tuple<>(3, 5);
    Tuple<Integer, Integer> myTuple2 = new Tuple<>(6, 8);
    Tuple<Integer, Integer> mySummedTuple = myTuple.add(myTuple2, ((a, b) -> a + b), ((a, b) -> a + b)); // Lambda functions provide ways to add each value of the tuple. The first lambda function adds the first tuple value, the second one adds the second.
```
