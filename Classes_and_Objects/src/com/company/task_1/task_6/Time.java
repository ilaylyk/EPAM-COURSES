package com.company.task_1.task_6;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private void setHours(int hours) {
        this.hours = (hours < 24 && hours >= 0) ? hours : 0;
    }

    private void setMinutes(int minutes) {
        this.minutes = (minutes < 60 && minutes >= 0) ? minutes : 0;
    }

    private void setSeconds(int seconds) {
        this.seconds = (seconds < 60 && seconds >= 0) ? seconds : 0;
    }

    private void increaseTime(int hours, int minutes, int seconds) {
        this.seconds += seconds;
        this.minutes += minutes;
        this.hours += hours;
        if (this.seconds >= 60) {
            this.minutes += this.seconds / 60;
            this.seconds %= 60;
        }
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
        if (this.hours >= 24) {
            this.hours = 0;
        }
    }

    private void reduceTime(int hours, int minutes, int seconds) {
        this.seconds -= seconds;
        this.minutes -= minutes;
        this.hours -= hours;
        if (this.seconds < 0) {
            this.minutes -= this.seconds / 60;
            this.seconds = -this.seconds % 60;
        }
        if (this.minutes < 0) {
            this.hours += this.minutes / 60 - 1;
            this.minutes = 60 + this.minutes % 60;
        }
        if (this.hours < 0) {
            this.hours = 24 + this.hours;
        }
    }

    @Override
    public String toString() {
        return hours + "h." +
                minutes + "m." +
                seconds + "s.";
    }

    public static void main(String[] args) {
        Time time = new Time(23, 15, 45);
        time.increaseTime(3, 20, 40);
        System.out.println(time.toString());
        time.reduceTime(2, 40, 50);
        System.out.println(time.toString());
        time.setHours(5);
        time.setMinutes(12);
        time.setSeconds(54);
        System.out.println(time.toString());
    }
}
