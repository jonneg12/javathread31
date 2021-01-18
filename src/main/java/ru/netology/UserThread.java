package ru.netology;

import static ru.netology.Main.NUMBER_OF_ITERATIONS;
import static ru.netology.Main.USER_ITERATIONS_DELAY;

public class UserThread extends Thread implements Turnable {

    private Tumbler tumbler;

    public UserThread(Tumbler tumbler) {
        this.tumbler = tumbler;
    }

    @Override
    public void turn(Tumbler tumbler) {
        System.out.println(tumbler);
        tumbler.setTumbler(true);
    }

    @Override
    public void run() {
        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            try {
                System.out.println("Iteration: " + i + ". " + tumbler);
                Thread.sleep(USER_ITERATIONS_DELAY);
                System.out.print("User turns tumbler, so ");
                this.turn(tumbler);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
