package com.company.task_2.task_3;

public class Main {
    public static void main(String[] args) {
        City a = new City("A");
        City c = new City("C");
        City f = new City("F");

        Region r1 = new Region(12, a);
        Region r2 = new Region(3, c);
        Region r3 = new Region(59, f);

        Land land = new Land("Great Land", f, new Region[]{r1, r2, r3});

        System.out.println("Land created, name : " + land.getName());
        System.out.println("Land capital: " + land.getCapital().getName());
        System.out.println("Land region count: " + land.getRegionsCount());
        System.out.println("Land area: " + land.getArea());
        System.out.println("Land regions centers: " + land.getRegionsCenters());
    }
}
