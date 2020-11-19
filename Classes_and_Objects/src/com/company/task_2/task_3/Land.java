package com.company.task_2.task_3;

public class Land {
    private final String name;
    private final Region[] regions;
    private final City capital;

    public Land(String name, City capital, Region[] regions) {
        this.name = name;
        this.capital = capital;
        this.regions = regions;
    }

    public String getName() {
        return name;
    }

    public City getCapital() {
        return capital;
    }

    public int getRegionsCount() {
        return regions.length;
    }

    public int getArea() {
        int area = 0;
        for (Region region : regions) {
            area += region.getArea();
        }
        return area;
    }

    public String getRegionsCenters() {
        StringBuilder centers = new StringBuilder("{ ");
        for (int i = 0; i < regions.length; i++) {
            if (i < regions.length - 1) {
                centers.append(regions[i].getCenter().getName()).append(", ");
            } else {
                centers.append(regions[i].getCenter().getName()).append(" }");
            }
        }
        return centers.toString();
    }
}
