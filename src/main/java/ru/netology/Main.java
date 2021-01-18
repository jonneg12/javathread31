package ru.netology;

public class Main {


    public static final int NUMBER_OF_ITERATIONS = 10;
    public static final int USER_ITERATIONS_DELAY = 500; //ms

    public static void main(String[] args) throws InterruptedException {

        Tumbler tumbler = new Tumbler();

        UserThread userThread = new UserThread(tumbler);

        ToyThread toyThread = new ToyThread(tumbler);

        userThread.start();
        toyThread.start();

        userThread.join();

        if (!userThread.isAlive()) {
            System.out.println("User thread is stopped.");
            toyThread.join();
        }

        if (!toyThread.isAlive()) {
            System.out.println("Toy thread is stopped.");
        } else {
            System.out.println("Something wrong - toy thread is not stopped!");
        }
    }

}
