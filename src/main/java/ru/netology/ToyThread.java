package ru.netology;

public class ToyThread extends Thread implements Turnable{
    Tumbler tumbler;

    public ToyThread(Tumbler tumbler){
        this.tumbler = tumbler;
    }

    @Override
    public void turn(Tumbler tumbler) {
        System.out.println(tumbler);
        tumbler.setTumbler(false);
    }

    @Override
    public void run() {
            while (!tumbler.isTumbler()) ;
            System.out.print("Toy turns tumbler, so ");
            this.turn(tumbler);
    }
}
