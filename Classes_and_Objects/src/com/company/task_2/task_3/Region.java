package com.company.task_2.task_3;

public class Region {
    private final int area;
    private final City regionCenter;

    public Region(int area, City regionCenter) {
        this.area = area;
        this.regionCenter = regionCenter;
    }

    public int getArea() {
        return area;
    }

    public City getCenter() {
        return regionCenter;
    }
}
