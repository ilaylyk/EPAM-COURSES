package com.company.task_1.task_5;

public class Counter {
    private int counter;

    public Counter() {
        counter = 0;
    }

    private Counter(int counter) {
        if (counter >= 0 && counter < 10) {
            this.counter = counter;
        } else {
            this.counter = 0;
        }

    }

    private void increase() {
        if (counter < 9) {
            counter++;
        } else {
            counter = 0;
        }

    }

    private void decrease() {
        if (counter > 0) {
            counter--;
        } else {
            counter = 9;
        }
    }

    public int getCurrentValue() {
        return counter;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(5);
        System.out.println("Counter 1 value: " + counter1.getCurrentValue());
        System.out.println("Counter 2 value: " + counter2.getCurrentValue());
        for (int i = 0; i < 6; i++) {
            counter1.increase();
            counter2.increase();
        }
        System.out.println("Counter 1 value after 6 incr: " + counter1.getCurrentValue());
        System.out.println("Counter 2 value after 6 incr: " + counter2.getCurrentValue());
        for (int i = 0; i < 7; i++) {
            counter1.decrease();
            counter2.decrease();
        }
        System.out.println("Counter 1 value after 7 decr: " + counter1.getCurrentValue());
        System.out.println("Counter 2 value after 7 decr: " + counter2.getCurrentValue());
    }
}
