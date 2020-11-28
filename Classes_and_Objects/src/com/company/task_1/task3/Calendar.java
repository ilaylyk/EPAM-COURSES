package com.company.task_1.task3;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Calendar {
    private final List<Holiday> holydays;

    public Calendar() {
        holydays = new ArrayList<>();
    }

    private static class Holiday {
        String title;
        LocalDate date;

        public Holiday(String title, LocalDate date) {
            this.title = title;
            this.date = date;
        }

        public String toString() {
            return "Title: " + title + ", date: " + date;
        }
    }

    public void addHolyday(String title, LocalDate date) {
        holydays.add(new Holiday(title, date));
        System.out.println("Added holyday: " + title + ", date = " + date);
    }

    public void printHolydaysInRange(LocalDate from, LocalDate to) {
        System.out.println("Holydays in range: from " + from + ", to " + to);
        for (Holiday holyday : holydays) {
            if (holyday.date.isAfter(from) && holyday.date.isBefore(to)) {
                System.out.println(holyday);
            }
        }
    }
}
