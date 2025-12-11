package wiringBeans.circular_dependencie;

public class Person {
    private Parrot parrot;
    // you can't do this because Spring will throw an exception
    // because to create a Parrot you need a Person and to create a Person you need a Parrot
}
