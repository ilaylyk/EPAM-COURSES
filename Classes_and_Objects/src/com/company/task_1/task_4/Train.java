package com.company.task_1.task_4;


import java.util.Scanner;

public class Train {
    private final String destinationName;
    private final int trainNumber;
    private final String departureTime;


    public Train(String destinationName, int trainNumber, String departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    private static void sortTrainsByNumber(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length - 1; j++) {
                if (trains[j].trainNumber < trains[j + 1].trainNumber) {
                    temp = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = temp;
                }
            }
        }
    }

    private static void sortTrainDestinationName(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length - 1; j++) {
                if (trains[j].destinationName.compareTo(trains[j + 1].destinationName) > 0) {
                    temp = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = temp;
                } else if (trains[j].destinationName.compareTo(trains[j + 1].destinationName) == 0) {
                    if (trains[j].departureTime.compareTo(trains[j + 1].departureTime) > 0) {
                        temp = trains[j];
                        trains[j] = trains[j + 1];
                        trains[j + 1] = temp;
                    }
                }
            }
        }
    }

    private static Train informationOfTrain(Train[] trains, int trainNumber) {

        for (Train train : trains) {
            if (train.trainNumber == trainNumber) {
                return train;
            }
        }
        return null;
    }

    private static void print(Train[] trains) {
        for (Train train : trains) {
            System.out.println(train);
        }
    }

    @Override
    public String toString() {
        return "destinationName= " + destinationName +
                ", trainNumber= " + trainNumber +
                ", departureTime= " + departureTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int trainNumber = scanner.nextInt();
        scanner.close();

        Train[] trains = new Train[]{
                new Train("Gomel", 254, "05:58"),
                new Train("Vilnus", 324, "10:48"),
                new Train("Moskow", 115, "13:15"),
                new Train("Gomel", 658, "18:41"),
                new Train("Kiev", 225, "06:40"),
        };

        System.out.println("Information about train " + Train.informationOfTrain(trains, trainNumber));
        System.out.println("sortingTrainByNumber");
        Train.sortTrainsByNumber(trains);
        print(trains);
        System.out.println("sortTrainDestinationName");
        Train.sortTrainDestinationName(trains);
        print(trains);
    }
}
